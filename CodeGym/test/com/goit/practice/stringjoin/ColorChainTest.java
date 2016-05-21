package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ColorChainTest {

    ColorChain colorChain = new ColorChain();

    @Test
    public void testCountV0() throws Exception {
        int n = 2;
        int expected = 2;

        int actualResult = colorChain.count(n);

        Assert.assertEquals("ColorChain should be count correctly for 2", expected, actualResult);
    }

    @Test
    public void testCountV1() throws Exception {
        int n = 5;
        int expected = 13;

        int actualResult = colorChain.count(n);

        Assert.assertEquals("ColorChain should be count correctly for 5", expected, actualResult);
    }

}