package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

public class KmpSubMoveTest {
    KmpSubMove kmpSubMove = new KmpSubMove();

    @Test
    public void testCountV0() throws Exception {
        String inputStr = "abcd";
        String resultStr = "cdab";
        int expected = 2;

        int actualResult = kmpSubMove.subMoveQuantity(inputStr, resultStr);

        Assert.assertEquals("KmpSubMove should be subMoveQuantity correctly", expected, actualResult);
    }
}