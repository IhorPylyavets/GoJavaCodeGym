package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountBitsTest {
    CountBits countBits = new CountBits();

    @Test
    public void testCountV0() throws Exception {
        int number = 0;
        int expected = 0;

        int actualResult = countBits.count(number);

        Assert.assertEquals("CountBits should be count correctly for *0*", expected, actualResult);
    }

    @Test
    public void testCountV1() throws Exception {
        int number = 1;
        int expected = 1;

        int actualResult = countBits.count(number);

        Assert.assertEquals("CountBits should be count correctly for *1*", expected, actualResult);
    }

    @Test
    public void testCountV13() throws Exception {
        int number = 13;
        int expected = 3;

        int actualResult = countBits.count(number);

        Assert.assertEquals("CountBits should be count correctly for *13*", expected, actualResult);
    }

    @Test
    public void testCountV893() throws Exception {
        int number = 893;
        int expected = 8;

        int actualResult = countBits.count(number);

        Assert.assertEquals("CountBits should be count correctly for *893*", expected, actualResult);
    }

    @Test
    public void testCountVMinLimit() throws Exception {
        int number = -2147483647;
        int expected = 2;

        int actualResult = countBits.count(number);

        Assert.assertEquals("CountBits should be count correctly for *-2147483647* MinLimit", expected, actualResult);
    }
}