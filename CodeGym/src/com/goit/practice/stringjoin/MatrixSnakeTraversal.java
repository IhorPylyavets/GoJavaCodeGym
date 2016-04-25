package com.goit.practice.stringjoin;

public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        int rows = input.length;
        int cols = input[0].length;

        int[] result = new int[rows*cols];

        for(int i = 0, k;i < rows; i++){
            for(int j = 0;j < cols; j++){
                if (j % 2 == 0) {
                    k = j*rows + i;
                } else {
                    k = ((j + 1) * rows) - i - 1;
                }
                result[k] = input[i][j];
            }
        }

        return result;
    }
}
