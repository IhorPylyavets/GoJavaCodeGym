package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoublesTest {
    Doubles doubles = new Doubles();

    @Test
    public void testParseV0() throws Exception {
        String a = "1";
        double expected = 1.0;

        double actualResult = doubles.parse(a);

        Assert.assertEquals("Doubles should be parse correctly", expected, actualResult, 0);
    }

}