package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

public class GnomeFoodTest {
    GnomeFood gnomeFood = new GnomeFood();

    @Test
    public void testFindByResources() throws Exception {
        int[] gnomes = {5, 7, 6, 9, 4};
        int[] portions = {8, 5, 6, 2, 3};
        int[] expected = {4, 2, 1, 0, 3};

        int[] actualResult = gnomeFood.find(gnomes, portions);

        Assert.assertArrayEquals("GnomeFood should be find correctly", expected, actualResult);
    }
}