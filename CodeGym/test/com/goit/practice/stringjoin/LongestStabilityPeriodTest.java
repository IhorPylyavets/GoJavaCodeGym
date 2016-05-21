package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestStabilityPeriodTest {
    LongestStabilityPeriod longestStabilityPeriod = new LongestStabilityPeriod();

    @Test
    public void testCountV0() throws Exception {
        int[] inputGdp = { 1000, };
        int expected = 1;

        int actualResult = longestStabilityPeriod.count(inputGdp);

        Assert.assertEquals("LongestStabilityPeriod should be count correctly for *{ 1000, }*", expected, actualResult);
    }

    @Test
    public void testCountV1() throws Exception {
        int[] inputGdp = { 900, 901, 902, };
        int expected = 2;

        int actualResult = longestStabilityPeriod.count(inputGdp);

        Assert.assertEquals("LongestStabilityPeriod should be count correctly for *{ 900, 901, 902, }*", expected, actualResult);
    }

    @Test
    public void testCountV2() throws Exception {
        int[] inputGdp = { 900, 900, 900, 901, 902, 902, 903, 903, };
        int expected = 4;

        int actualResult = longestStabilityPeriod.count(inputGdp);

        Assert.assertEquals("LongestStabilityPeriod should be count correctly for *{ 900, 900, 900, 901, 902, 902, 903, 903, }*", expected, actualResult);
    }

}