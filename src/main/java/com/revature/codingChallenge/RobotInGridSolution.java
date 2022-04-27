package com.revature.codingChallenge;

import java.util.Stack;

public class RobotInGridSolution {

    public Stack<Character> findPathSolution (char[][] grid){
        Stack<Character> ans = new Stack<>();


        return ans;
    }

    public void moveRight(char[][] grid, int currentCol, int currentRow, Stack<Character> ans){
        if(currentRow < grid[0].length-1 && grid[currentCol][currentRow+1]=='e'){

        }

        if(currentRow == grid[0].length-1 && currentCol<grid.length){
            moveDown(grid, currentCol, currentRow, ans);
        }

    }

    public void moveDown(char[][] grid, int currentCol, int currentRow, Stack<Character> ans){
        if(currentCol == grid.length-1){
            moveRight(grid, currentCol, currentRow, ans);
        }
    }

}
