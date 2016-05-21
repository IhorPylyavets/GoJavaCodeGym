package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

public class RectangleSquareTest {
    RectangleSquare rectangleSquare = new RectangleSquare();

    @Test
    public void testMeasure() throws Exception {
        int[] x = {0, 0};
        int[] h = {20, 10};
        int[] w = {10, 20};
        int expected = 300;

        int actualResult = rectangleSquare.measure(x, h, w);

        Assert.assertEquals("RectangleSquare should be measure correctly", expected, actualResult);
    }

    @Test
    public void testMeasureWithOneFigure() throws Exception {
        int[] x = {1};
        int[] h = {4};
        int[] w = {2};
        int expected = 8;

        int actualResult = rectangleSquare.measure(x, h, w);

        Assert.assertEquals("RectangleSquare should be measure correctly", expected, actualResult);
    }

    @Test
    public void testMeasureV0() throws Exception {
        int[] x = {1, 5};
        int[] h = {4, 2};
        int[] w = {2, 4};
        int expected = 16;

        int actualResult = rectangleSquare.measure(x, h, w);

        Assert.assertEquals("RectangleSquare should be measure correctly", expected, actualResult);
    }

    @Test
    public void testMeasureV1() throws Exception {
        int[] x = {1, 5, 2, 4};
        int[] h = {4, 2, 5, 7};
        int[] w = {2, 4, 5, 2};
        int expected = 37;

        int actualResult = rectangleSquare.measure(x, h, w);

        Assert.assertEquals("RectangleSquare should be measure correctly", expected, actualResult);
    }

}