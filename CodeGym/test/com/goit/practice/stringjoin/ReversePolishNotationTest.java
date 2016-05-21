package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePolishNotationTest {
    ReversePolishNotation reversePolishNotation = new ReversePolishNotation();

    @Test
    public void testEvaluateV0() throws Exception {
        String inputExpression = "1 2 +";
        int expected = 3;

        int actualResult = reversePolishNotation.evaluate(inputExpression);

        Assert.assertEquals("ReversePolishNotation should be evaluate correctly for *1 2 +*", expected, actualResult);

    }

    @Test
    public void testEvaluateV1() throws Exception {
        String inputExpression = "17 2 -";
        int expected = 15;

        int actualResult = reversePolishNotation.evaluate(inputExpression);

        Assert.assertEquals("ReversePolishNotation should be evaluate correctly for *17 2 -*", expected, actualResult);

    }

}