package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTraversalTest {
    MatrixTraversal matrixTraversal = new MatrixTraversal();

    @Test
    public void testPrintMatrixThreeThree() throws Exception {
        int[][] input = {{1, 2, 3}, {6, 7, 8}, {11, 12, 13}};
        int[] expected = {1, 2, 3, 8, 13, 12, 11, 6, 7};

        int[] actualResult = matrixTraversal.print(input);

        Assert.assertArrayEquals("MatrixSnakeTraversal should be created correctly for array 3*3", expected, actualResult);
    }

    @Test
    public void testPrintMatrixThreeFour() throws Exception {
        int[][] input = {{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }};
        int[] expected = { 1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8 };

        int[] actualResult = matrixTraversal.print(input);

        Assert.assertArrayEquals("MatrixSnakeTraversal should be created correctly for array 3*4", expected, actualResult);
    }

    @Test
    public void testPrintMatrixFourFour() throws Exception {
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[] expected = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};

        int[] actualResult = matrixTraversal.print(input);

        Assert.assertArrayEquals("MatrixTraversal should be created correctly for array 4*4", expected, actualResult);
    }
}