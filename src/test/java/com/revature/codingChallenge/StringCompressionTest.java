package com.revature.codingChallenge;


import org.junit.Assert;
import org.junit.Test;

public class StringCompressionTest {

    @Test
    public void testStringCompressionTest1(){
        StringCompression stringCompression = new StringCompression();

        String testString = "aabcccccaaa";
        String result = stringCompression.StringCompression(testString);

        Assert.assertEquals("a2b1c5a3", result);
    }

    @Test
    public void testStringCompressionTest2(){
        StringCompression stringCompression = new StringCompression();

        String testString = "xxxyyzzzzzzi";
        String result = stringCompression.StringCompression(testString);

        Assert.assertEquals("x3y2z6i1", result);
    }

    @Test
    public void testStringCompressionTest3(){
        StringCompression stringCompression = new StringCompression();

        String testString = "aabbccddee";
        String result = stringCompression.StringCompression(testString);

        Assert.assertEquals("aabbccddee", result);
    }

    @Test
    public void testStringCompressionTest4(){
        StringCompression stringCompression = new StringCompression();

        String testString = "abcd";
        String result = stringCompression.StringCompression(testString);

        Assert.assertEquals("abcd", result);
    }
}
