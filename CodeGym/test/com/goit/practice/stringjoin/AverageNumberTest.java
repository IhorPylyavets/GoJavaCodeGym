package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AverageNumberTest {
    AverageNumber averageNumber = new AverageNumber();

    @Test
    public void testAverage() throws Exception {
        int a = 4;
        int b = 6;
        int expected = 5;

        int actualResult = averageNumber.average(a, b);

        Assert.assertEquals("PositiveAverageNumber average be count correctly for 4,6", expected, actualResult);

    }

    @Test
    public void testAverageV1() throws Exception {
        int a = -4;
        int b = -7;
        int expected = -5;

        int actualResult = averageNumber.average(a, b);

        Assert.assertEquals("PositiveAverageNumber average be count correctly for -4,-7", expected, actualResult);

    }

    @Test
    public void testAverageV2() throws Exception {
        int a = -4;
        int b = 7;
        int expected = 1;

        int actualResult = averageNumber.average(a, b);

        Assert.assertEquals("PositiveAverageNumber average be count correctly for -4,1", expected, actualResult);

    }

    @Test
    public void testAverageV3() throws Exception {
        int a = -2147483648;
        int b = -2;
        int expected = -1073741825;

        int actualResult = averageNumber.average(a, b);

        Assert.assertEquals("PositiveAverageNumber average be count correctly for -2147483648, -2", expected, actualResult);

    }

    @Test
    public void testAverageV4() throws Exception {
        int a = -3;
        int b = -3;
        int expected = -3;

        int actualResult = averageNumber.average(a, b);

        Assert.assertEquals("PositiveAverageNumber average be count correctly for -3,-3", expected, actualResult);

    }

    @Test
    public void testAverageV5() throws Exception {
        int a = -7;
        int b = -5;
        int expected = -6;

        int actualResult = averageNumber.average(a, b);

        Assert.assertEquals("PositiveAverageNumber average be count correctly for -7,-5", expected, actualResult);

    }

    @Test
    public void testAverageV6() throws Exception {
        int a = 7;
        int b = 5;
        int expected = 6;

        int actualResult = averageNumber.average(a, b);

        Assert.assertEquals("PositiveAverageNumber average be count correctly for 7,5", expected, actualResult);

    }
}