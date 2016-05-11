package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnixPathTest {
    UnixPath unixPath = new UnixPath();

    @Test
    public void testSimplify() throws Exception {
        String input = "/home/../var/./lib//file.txt";
        String expected = "/var/lib/file.txt";

        String actualResult = unixPath.simplify(input);

        Assert.assertEquals("UnixPath average be simplify correctly ", expected, actualResult);
    }
}