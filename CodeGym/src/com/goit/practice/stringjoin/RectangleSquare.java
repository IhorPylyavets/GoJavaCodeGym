package com.goit.practice.stringjoin;

/*
Площа прямокутників
Знайти площу яку займають N прямокутників на площині.
У всіх прямокутників одна зі сторін лежить на осі абсцис (X).
Дано три масива довжиною N.
В першому масиві Х координата нижньої-лівої вершини і-го прямокутника ,
висота в другому, ширина в третьому. Всі значення невід'ємні.
Приклад: X - [0, 0], H - [20, 10], W - [10, 20]; Відповідь - 300.
* */

import java.util.*;

public class RectangleSquare {
    public int measure(int[] x, int[] h, int[] w) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        ArrayList<Integer> points = new ArrayList<>();

        for (int i = 0; i < x.length; i++) {
            points.add(x[i]);
            points.add(x[i] + w[i]);
            rectangles.add(new Rectangle(x[i], h[i], w[i]));
        }

        Set<Integer> pointsWithoutDuplicates = new HashSet<>();
        pointsWithoutDuplicates.addAll(points);
        points.clear();
        points.addAll(pointsWithoutDuplicates);

        Collections.sort(points);

        ArrayList<Rectangle> columns = new ArrayList<>();
        for (int i = 0; i < points.size()-1; i++) {
            int heightIntervalBetweenPointers = 0;
            int beginPoint = points.get(i);
            int endPoint = points.get(i+1);

            for (Rectangle rectangle : rectangles) {
                if ((rectangle.getStartX() <= beginPoint) &&
                        (rectangle.getEndX() >= endPoint) &&
                        (rectangle.getHeight() > heightIntervalBetweenPointers)) {

                    heightIntervalBetweenPointers = rectangle.getHeight();
                }
            }

            if (heightIntervalBetweenPointers > 0){
                columns.add(new Rectangle(beginPoint, heightIntervalBetweenPointers, endPoint - beginPoint));
            }
        }

        int square = 0;
        for (Rectangle rectangle : columns) square += rectangle.getSquare();

        return square;
    }

    private class Rectangle {
        private int startX;
        private int height;
        private int width;
        private int endX;
        private int square;

        public Rectangle(int x, int h, int w) {
            this.startX = x;
            this.height = h;
            this.width = w;
            this.endX = x + w;
            this.square = w * h;
        }

        public int getStartX() {
            return startX;
        }

        public void setStartX(int startX) {
            this.startX = startX;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int h) {
            this.height = h;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        private void setEndX(int endX) {
            this.endX = endX;
        }

        public int getEndX() {
            return endX;
        }

        public int getSquare() {
            return square;
        }

        private void setSquare(int square) {
            this.square = square;
        }
    }
}
