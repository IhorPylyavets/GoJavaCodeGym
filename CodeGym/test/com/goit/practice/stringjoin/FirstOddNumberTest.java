package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstOddNumberTest {
    FirstOddNumber firstOddNumber = new FirstOddNumber();

    @Test
    public void testFindEmptyArray() throws Exception {
        int[] input = {};
        int expected = -1;

        int actualResult = firstOddNumber.find(input);

        Assert.assertEquals("FirstOddNumber should be find correctly for empty array", expected, actualResult);
    }

    @Test
    public void testFindRandomArray() throws Exception {
        int[] input = {6, 7, 3, -5, 8, 13};
        int expected = 1;

        int actualResult = firstOddNumber.find(input);

        Assert.assertEquals("FirstOddNumber should be find correctly random array", expected, actualResult);
    }

    @Test
    public void testFindRandomArrayWithoutOdd() throws Exception {
        int[] input = {6, 2, 3, 8, 13};
        int expected = 2;

        int actualResult = firstOddNumber.find(input);

        Assert.assertEquals("FirstOddNumber should be find correctly random array without odd number", expected, actualResult);
    }
}