package com.revature.codingChallenge;

public class Main {
    public static void main(String[] args) {

        BuildOrderSolution solution = new BuildOrderSolution();

        char[] projects = {'a','b','c','d','e','f'};
        char[][] dependencies = {{'a','b'},
                                {'f','b'},
                                {'b','d'},
                                {'f','a'},
                                {'d','c'},};

        char[] ans = solution.buildOrderSolution(projects, dependencies);
        for(char c:ans){
            System.out.println(c + " ");
        }
    }
}
