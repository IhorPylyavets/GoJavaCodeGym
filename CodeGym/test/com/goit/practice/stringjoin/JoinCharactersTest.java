package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

public class JoinCharactersTest {
    JoinCharacters joinCharacters = new JoinCharacters();

    @Test
    public void testSingleElementArray() throws Exception {
        char[] input = {'1'};
        int expected = 1;

        int actualResult = joinCharacters.join(input);

        Assert.assertEquals("Characters should be joined correctly for single element array", expected, actualResult);
    }

    @Test
    public void testSingleElementArrayWithZero() throws Exception {
        char[] input = {'0'};
        int expected = 0;

        int actualResult = joinCharacters.join(input);

        Assert.assertEquals("Characters should be joined correctly for single element array with zero", expected, actualResult);
    }

    @Test
    public void testThreeElementArray() throws Exception {
        char[] input = {'1', '8', '3'};
        int expected = 183;

        int actualResult = joinCharacters.join(input);

        Assert.assertEquals("Characters should be joined correctly for three element array", expected, actualResult);
    }


}