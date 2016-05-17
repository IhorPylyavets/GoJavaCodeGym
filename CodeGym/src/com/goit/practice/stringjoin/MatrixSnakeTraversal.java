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
        int[] result = new int[input.length * input[0].length];

        for(int i = 0, k;i < input.length; i++){
            for(int j = 0;j < input[0].length; j++){
                if (j % 2 == 0) {
                    k = j * input.length + i;
                } else {
                    k = ((j + 1) * input.length) - i - 1;
                }
                result[k] = input[i][j];
            }
        }

        return result;
    }
}
