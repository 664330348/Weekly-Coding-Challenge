package com.revature.codingChallenge;

public class Main {
    public static void main(String[] args) throws Exception {
        testStringCompression();
    }

    public static void testStringCompression(){
        StringCompression stringCompression = new StringCompression();

        String testString = "aabcccccaaa";
        System.out.println(stringCompression.StringCompression(testString));
    }

    public static void testRobotInGridSolution(){
        RobotInGridSolution solution = new RobotInGridSolution();
        //r=robot; b=blank; o=off-limits; e=end;
        char[][] grid = {{'r','b','o','b'},
                        {'b','b','o','b'},
                        {'b','b','b','b'},
                        {'o','o','b','o'},
                        {'b','b','b','e'}};
        System.out.println(solution.findPathSolution(grid));
    }

    public static void testBuildOrderSolution() throws Exception {
        BuildOrderSolution solution = new BuildOrderSolution();

        char[] projects = {'a','b','c','d','e','f'};
        char[][] dependencies = {{'a','d'},
                {'f','b'},
                {'b','d'},
                {'f','a'},
                {'d','c'},};

        char[] ans = solution.buildOrderSolution(projects, dependencies);
        System.out.println(ans);
    }
}
