package com.revature.codingChallenge;

public class Main {
    public static void main(String[] args) throws Exception {

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
