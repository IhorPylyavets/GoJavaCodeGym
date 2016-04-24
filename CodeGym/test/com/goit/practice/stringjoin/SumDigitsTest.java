package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumDigitsTest {
    SumDigits sumDigits = new SumDigits();

    @Test
    public void testSumOne() throws Exception {
        int number = 1;
        int expected = 1;

        int actualResult = sumDigits.sum(number);

        Assert.assertEquals("SumDigits should be sum correctly for one", expected, actualResult);
    }

    @Test
    public void testSumZero() throws Exception {
        int number = 0;
        int expected = 0;

        int actualResult = sumDigits.sum(number);

        Assert.assertEquals("SumDigits should be sum correctly for zero", expected, actualResult);
    }

    @Test
    public void testSumRandomNumber() throws Exception {
        int number = 1453;
        int expected = 13;

        int actualResult = sumDigits.sum(number);

        Assert.assertEquals("SumDigits should be sum correctly for random number", expected, actualResult);
    }

    @Test
    public void testSumNegativeRandomNumber() throws Exception {
        int number = -1453;
        int expected = 13;

        int actualResult = sumDigits.sum(number);

        Assert.assertEquals("SumDigits should be sum correctly negative random number", expected, actualResult);
    }

    @Test
    public void testSumNegativeIntegerLimit() throws Exception {
        int number = -2147483648;
        int expected = 47;

        int actualResult = sumDigits.sum(number);

        Assert.assertEquals("SumDigits should be sum correctly negative Integer limit number", expected, actualResult);
    }

    @Test
    public void testSumPositiveIntegerLimit() throws Exception {
        int number = 2147483647;
        int expected = 46;

        int actualResult = sumDigits.sum(number);

        Assert.assertEquals("SumDigits should be sum correctly positive Integer limit number", expected, actualResult);
    }
}