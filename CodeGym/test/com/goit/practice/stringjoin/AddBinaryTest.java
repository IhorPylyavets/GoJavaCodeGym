package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {
    AddBinary addBinary = new AddBinary();

    @Test
    public void testAddV0() throws Exception {
        String a = "101";
        String b = "1000";
        String expected = "1101";

        String actualResult = addBinary.add(a, b);

        Assert.assertEquals("AddBinary should be add correctly", expected, actualResult);
    }

    @Test
    public void testAddV1() throws Exception {
        String a = "10000000000000000000000000000000";
        String b = "10000000000000000000000000000000";
        String expected = "100000000000000000000000000000000";

        String actualResult = addBinary.add(a, b);

        Assert.assertEquals("AddBinary should be add correctly", expected, actualResult);
    }

}
