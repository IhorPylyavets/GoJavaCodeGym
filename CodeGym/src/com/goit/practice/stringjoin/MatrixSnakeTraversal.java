package com.goit.practice.stringjoin;

/*
* Обійти матрицю "змійкою" і повернути всі числа в одномірному масиві.
Наприклад:
Для
[[ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]]
повернути
[1, 4, 7, 8, 5, 2, 3, 6, 9]
* */

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
