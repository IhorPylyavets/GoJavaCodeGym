package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxNumberTest {
    FindMaxNumber findMaxNumber = new FindMaxNumber();

    @Test
    public void testMax() throws Exception {
        int[] input = {6, 7, 3, -5, 8, 13};
        int expected = 13;

        int actualResult = findMaxNumber.max(input);

        Assert.assertEquals("FindMaxNumber should be find correctly random array", expected, actualResult);
    }
}