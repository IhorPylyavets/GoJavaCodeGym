package com.goit.practice.stringjoin;

/*
* Дано число. Треба замінити i-й біт замінити на нуль.
Наприклад:
для числа 6 в бінарному вигляді 110,
замінивши 2-й біт на нуль отримаємо 100 тобто 4.
1<= i <= 32
* */
public class SetZero {
    public int set(int number, int i) {
        int value = 1 << (i-1);

        if ((number & value) == value) {
            number -= value;
        }

        return number;
    }
}
