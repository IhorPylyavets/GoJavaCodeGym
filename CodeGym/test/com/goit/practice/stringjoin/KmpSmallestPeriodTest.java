package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

public class KmpSmallestPeriodTest {
    KmpSmallestPeriod kmpSmallestPeriod = new KmpSmallestPeriod();

    @Test
    public void testCountV0() throws Exception {
        String input = "abcabcabcabc";
        String expected = "abc";

        String actualResult = kmpSmallestPeriod.findSmalletstPeriod(input);

        Assert.assertEquals("KmpSmallestPeriod should be findSmalletstPeriod correctly for *abcabcabcabc*", expected, actualResult);
    }

    @Test
    public void testCountV1() throws Exception {
        String input = "aaaaaa";
        String expected = "a";

        String actualResult = kmpSmallestPeriod.findSmalletstPeriod(input);

        Assert.assertEquals("KmpSmallestPeriod should be findSmalletstPeriod correctly for *aaaaaa*", expected, actualResult);
    }

    @Test
    public void testCountV2() throws Exception {
        String input = "abcabcabcabd";
        String expected = "abcabcabcabd";

        String actualResult = kmpSmallestPeriod.findSmalletstPeriod(input);

        Assert.assertEquals("KmpSmallestPeriod should be findSmalletstPeriod correctly for *abcabcabcabd*", expected, actualResult);
    }

}