package com.revature.codingChallenge;

public class StringCompression {

    public String StringCompression(String inputString){
        StringBuilder ans = new StringBuilder();

        if(inputString.length()<=2) return inputString;

        char tempChar = inputString.charAt(0);
        ans.append(tempChar);
        int count = 1;


        for(int i=1; i<inputString.length(); i++){
            char currentChar = inputString.charAt(i);
            if(currentChar == tempChar){
                count++;
            }else{
                ans.append(String.valueOf(count));
                ans.append(currentChar);
                tempChar=currentChar;
                count=1;
            }
        }
        ans.append(String.valueOf(count));

        if (ans.length()>=inputString.length())
            return inputString;

        return ans.toString();
    }
}
