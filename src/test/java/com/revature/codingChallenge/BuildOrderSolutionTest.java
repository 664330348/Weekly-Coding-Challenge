package com.revature.codingChallenge;


import org.junit.Assert;
import org.junit.Test;

public class BuildOrderSolutionTest {

    @Test
    public void testBuildOrderSolution1() throws Exception {
        char[] projects1 = {'a','b','c','d','e','f'};
        char[][] dependencies1 = {{'a','d'},
                                {'f','b'},
                                {'b','d'},
                                {'f','a'},
                                {'d','c'},};
        BuildOrderSolution solution = new BuildOrderSolution();

        char[] answer = {'f','a','b','d','c','e'};
        Assert.assertTrue(EequalOrder(answer,solution.buildOrderSolution(projects1,dependencies1)));
    }

    @Test
    public void testBuildOrderSolution2() throws Exception {
        char[] projects2 = {'a','b','c','d','e','f'};
        char[][] dependencies2 = {{'a','d'},
                                {'f','d'},
                                {'f','c'},
                                {'a','e'},
                                {'f','a'},};
        BuildOrderSolution solution = new BuildOrderSolution();

        char[] answer = {'f','a','d','c','e','b'};
        Assert.assertTrue(EequalOrder(answer,solution.buildOrderSolution(projects2,dependencies2)));
    }

    @Test
    public void testBuildOrderSolution3() throws Exception {
        char[] projects3 = {'a','b','c','d','e','f'};
        char[][] dependencies3 = {{'a','d'},
                {'f','d'},
                {'f','c'},
                {'c','a'},
                {'f','a'},};
        BuildOrderSolution solution = new BuildOrderSolution();
        Exception thrown = Assert.assertThrows(Exception.class, ()->solution.buildOrderSolution(projects3,dependencies3));
        Assert.assertEquals("NO solution",thrown.getMessage());
    }


    public boolean EequalOrder(char[]answer, char[]solution){
        for(int i=0; i<answer.length; i++){
            if(answer[i] != solution[i])
                return false;
        }
        return true;
    }
}
