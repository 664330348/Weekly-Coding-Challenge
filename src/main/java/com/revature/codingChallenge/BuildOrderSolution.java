package com.revature.codingChallenge;

public class BuildOrderSolution {

    public char[] buildOrderSolution(char[]projects,char[][]dependencies) throws Exception {
        //Case1: the dependencies don't affect the result.
        if(dependencies.length<=1){
            return projects;
        }

        //Case2: the dependencies affect the result.
        char[] ans = new char[projects.length];

        //initial first dependencies order
        ans[0]=dependencies[0][0];
        ans[1]=dependencies[0][1];
        int currentElement = 2;


        for(int i=1; i<dependencies.length; i++){
            int IndexOfSecondProject = projectIndex(ans, currentElement, dependencies[i][1]);

            //if the second project from dependencies is not shown in the ans list, add it to the last.
            if(IndexOfSecondProject == -1){
                ans[currentElement] = dependencies[i][1];
                currentElement++;

                //if the first project is also not shown in the ans list, add it before the last.
                if(projectIndex(ans, currentElement, dependencies[i][0]) == -1){
                    ans[currentElement] = dependencies[i][1];
                    ans[currentElement-1] = dependencies[i][0];
                    currentElement++;
                }
            }

            else{
                int IndexOfFirstProject = projectIndex(ans, currentElement, dependencies[i][0]);
                //if the second project is exited in the ans list, and first project is after second project in the ans list,
                //shift everything after second project to left with one block, and add the second project to the last.
                if(IndexOfFirstProject > IndexOfSecondProject){
                    char temp = ans[IndexOfSecondProject];
                    for(int index = IndexOfSecondProject; index<IndexOfFirstProject; index++){
                        ans[index] = ans[index+1];
                    }
                    ans[IndexOfFirstProject] = temp;
                } else if (IndexOfFirstProject == -1){
                  //if the second project is exited in the ans list, but the first project was not shown in the ans list, add the first project before the second project.
                    for(int last=currentElement; last>IndexOfSecondProject ; last--){
                        ans[last] = ans[last-1];
                    }
                    ans[IndexOfSecondProject] = dependencies[i][0];
                    currentElement++;
                }
            }
        }

        //Check if current ans list works for all the dependencies
        for(char[] dependency: dependencies){
            if(projectIndex(ans,currentElement,dependency[0]) > projectIndex(ans,currentElement,dependency[1])){
                throw (new Exception("NO solution"));
            }
        }

        //Add an independence project to the ans list, if there is one.
        if (currentElement<projects.length){
            for(char project: projects){
                if(projectIndex(ans,currentElement, project) == -1){
                    ans[currentElement] = project;
                    currentElement++;
                }
            }
        }
        return ans;
    };

    int projectIndex(char[] array, int currentElement, char project){
        for(int i=0; i<currentElement; i++){
            if(array[i] == project){
                return i;
            }
        }
        return -1;
    }

}
