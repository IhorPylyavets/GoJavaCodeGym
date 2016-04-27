package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

public class AbcNumberTest {
    AbcNumber abcNumber = new AbcNumber();

    @Test
    public void testConvert() throws Exception { //Для "bcd" повернути 123
        String number = "bcd";
        int expected = 123;

        int actualResult = abcNumber.convert(number);

        Assert.assertEquals("AbcNumber should be convert correctly for *bcd*", expected, actualResult);

    }
}