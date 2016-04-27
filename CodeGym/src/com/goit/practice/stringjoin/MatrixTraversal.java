package com.goit.practice.stringjoin;

/*
* Обійти матрицю по спіралі і записати всі числа в одмірний масив.
Для матриці
[[1,   2,  3,  4],
 [5,   6,  7,  8]
 [9,  10, 11, 12]
 [13, 14, 15, 16]]
вивести [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
* */

public class MatrixTraversal {
    public int[] print(int[][] input) {
        int rowSize = input.length;
        int colSize = input[0].length;

        int[] result = new int[rowSize*colSize];

        Direction direction = Direction.RIGHT;

        int index = 0;
        int curLine = 0;
        int curColumn = -1;

        int stepsColumns = colSize;
        int stepsLines = rowSize - 1;

        while (stepsColumns >= 0 && stepsLines >= 0) {
            switch (direction) {
                case RIGHT: {
                    for (int i = 0; i < stepsColumns; i++) {
                        result[index++] = input[curLine][++curColumn];
                    }
                    stepsColumns--;
                }
                break;
                case LEFT: {
                    for (int i = 0; i < stepsColumns; i++) {
                        result[index++] = input[curLine][--curColumn];
                    }
                    stepsColumns--;
                }
                break;
                case DOWN: {
                    for (int i = 0; i < stepsLines ; i++) {
                        result[index++] = input[++curLine][curColumn];
                    }
                    stepsLines--;
                }
                break;
                case UP: {
                    for (int i = 0; i < stepsLines; i++) {
                        result[index++] = input[--curLine][curColumn];
                    }
                    stepsLines--;
                }
                break;
            }
            direction = direction.makeTurn();
        }

        return result;
    }

    public enum Direction {
        RIGHT, DOWN, LEFT, UP;

        public Direction makeTurn() {
            if (this == RIGHT) return DOWN;
            if (this == DOWN) return LEFT;
            if (this == LEFT) return UP;
            else return RIGHT;
        }
    }
}
