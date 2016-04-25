package com.goit.practice.stringjoin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSnakeTraversalTest {
    MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();

    @Test
    public void testPrintMatrixThreeThree() throws Exception {
        int[][] input = {{ 1, 2, 3}, { 4, 5, 6}, { 7, 8, 9}};
        int[] expected = {1, 4, 7, 8, 5, 2, 3, 6, 9};

        int[] actualResult = matrixSnakeTraversal.print(input);

        Assert.assertArrayEquals("MatrixSnakeTraversal should be created correctly for array 3*3", expected, actualResult);
    }

    @Test
    public void testPrintMatrixTwoTwo() throws Exception {
        int[][] input = {{ 1, 2, }, { 3, 4 }};
        int[] expected = {1, 3, 4, 2};

        int[] actualResult = matrixSnakeTraversal.print(input);

        Assert.assertArrayEquals("MatrixSnakeTraversal should be created correctly for array 2*2", expected, actualResult);
    }

    @Test
    public void testPrintMatrixFourThree() throws Exception {
        int[][] input = {{1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12}};
        int[] expected = { 1, 4, 7, 10, 11, 8, 5, 2, 3, 6, 9, 12};

        int[] actualResult = matrixSnakeTraversal.print(input);

        Assert.assertArrayEquals("MatrixSnakeTraversal should be created correctly for array 4*3", expected, actualResult);
    }

    @Test
    public void testPrintMatrixThreeFive() throws Exception {
        int[][] input = {{1, 2, 3, 4, 5 }, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int[] expected = { 1, 6, 11, 12, 7, 2, 3, 8, 13, 14, 9, 4, 5, 10, 15};

        int[] actualResult = matrixSnakeTraversal.print(input);

        Assert.assertArrayEquals("MatrixSnakeTraversal should be created correctly for array 4*3", expected, actualResult);
    }
}