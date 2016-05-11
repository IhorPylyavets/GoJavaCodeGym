package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

public class WordNumberTest {
    WordNumber wordNumber = new WordNumber();

    @Test
    public void testCountNullString() throws Exception {
        String input = "";
        int expected = 0;

        int actualResult = wordNumber.count(input);

        Assert.assertEquals("WordNumber count be work correctly", expected, actualResult);
    }

    @Test
    public void testCount() throws Exception {
        String input = "Android BroadCastReceiver for volume key up and] down";
        int expected = 7;

        int actualResult = wordNumber.count(input);

        Assert.assertEquals("WordNumber count be work correctly", expected, actualResult);
    }
}
