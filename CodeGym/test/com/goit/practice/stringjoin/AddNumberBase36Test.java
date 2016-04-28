package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;


public class AddNumberBase36Test {
    AddNumberBase36 addNumberBase36 = new AddNumberBase36();

    @Test
    public void testAddV0() throws Exception {
        String a = "9";
        String b = "1";
        String expected = "a";

        String actualResult = addNumberBase36.add(a, b);

        Assert.assertEquals("AddNumberBase36 should be count add for *9*,*1*", expected, actualResult);

    }

    @Test
    public void testAddV1() throws Exception {
        String a = "11";
        String b = "22";
        String expected = "33";

        String actualResult = addNumberBase36.add(a, b);

        Assert.assertEquals("AddNumberBase36 should be count add for *11*,*22*", expected, actualResult);

    }

    @Test
    public void testAddV2() throws Exception {
        String a = "zjfghfhdsdfathjjhgjhghjfjfjhjhdsrreqqklhu456hfz5";
        String b = "wsfgsgds56346263fgfhghfghfhgfsrr5476hjfgdhdhg3N";
        String expected = "10g7vy7xrkildxnlpkvzwxy0uzwyyzx6kiwixx24xahmjyw2s";

        String actualResult = addNumberBase36.add(a, b);

        Assert.assertEquals("AddNumberBase36 should be count add for long String data", expected, actualResult);

    }
}