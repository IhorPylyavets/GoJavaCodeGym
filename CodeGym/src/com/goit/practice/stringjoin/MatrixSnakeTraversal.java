package com.goit.practice.stringjoin;

public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        int[] result = new int[input.length*input[0].length];

        for(int i = 0, k;i < input.length; i++){
            for(int j = 0;j < input[i].length; j++){
                if (j % 2 == 0) {
                    k = j*input.length + i;
                } else {
                    k = ((j + 1) * input.length) - i - 1;
                }
                result[k] = input[i][j];
            }
        }

        return result;
    }
}
