package com.goit.practice.stringjoin;

/*
* Обчислити суму цифр числа.
Наприклад сума цифр числа 123 дорівнює  6.
* */
public class SumDigits {
    public int sum(int number) {
        return sumOfDigitUsingRecursion(number, 0);
    }

    private int sumOfDigitUsingRecursion(int number, int sum) {
        if (number == 0) {
            return sum;
        }

        int recursionNumber = number / 10;
        int addResult = number % 10;

        if (addResult < 0) {
            addResult *= -1;
            recursionNumber *= -1;
        }

        sum += addResult;
        return sumOfDigitUsingRecursion(recursionNumber, sum);
    }
}
