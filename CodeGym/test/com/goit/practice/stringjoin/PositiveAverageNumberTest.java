package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositiveAverageNumberTest {
    PositiveAverageNumber positiveAverageNumber = new PositiveAverageNumber();

    @Test
    public void testAverage() throws Exception {
        int a = 2;
        int b = 4;
        int expected = 3;

        int actualResult = positiveAverageNumber.average(a, b);

        Assert.assertEquals("PositiveAverageNumber average be count correctly for 2,4", expected, actualResult);
    }

    @Test
    public void testAverageV2() throws Exception {
        int a = 4;
        int b = 7;
        int expected = 5;

        int actualResult = positiveAverageNumber.average(a, b);

        Assert.assertEquals("PositiveAverageNumber average be count correctly for 4,7", expected, actualResult);
    }

    @Test
    public void testAverageV3() throws Exception {
        int a = 1073741824;
        int b = 1073741824;
        int expected = 1073741824;

        int actualResult = positiveAverageNumber.average(a, b);

        Assert.assertEquals("PositiveAverageNumber average be count correctly for 1073741824,1073741824", expected, actualResult);
    }
}