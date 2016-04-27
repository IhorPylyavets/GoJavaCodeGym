package com.goit.practice.stringjoin;

/*
* Знайти середнє значення двох цілих чисел.
Приклади:
average( 4, 6 ) = 5
average( -4, -7 ) = -5
average( -4, 7 ) = 1
* */

public class AverageNumber {
    public int average(int a, int b) {
        return (a/2 + b/2) + (a%2 + b%2)/2;
    }
}
