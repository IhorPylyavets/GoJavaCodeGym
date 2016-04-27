package com.goit.practice.stringjoin;

/*
* Знайти середнє арифметике двух додатніх чисел.
Наприклад:
average( 2, 4 ) = 3
average( 4, 7 ) = 5
* */

public class PositiveAverageNumber {
    public int average(int a, int b) {
        /*if (a == b) {
            return a;
        }
        return (a + b)/2;*/
        return (a/2 + b/2) + (a%2 + b%2)/2;
    }
}
