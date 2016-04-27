package com.goit.practice.stringjoin;

/*
* Для даного числа порахувати кількість біт.
Наприклад:
Для числа 13 в бінарному вигляді 1101 повернути 3.
* */

public class CountBits {
    public int count(int number){
        int count = 0;

        for(int i = 0; i < 32 && number != 0; i++){
            if( (number&1) == 1) {
                count++;
            }
            number = number >>> 1;
        }

        return count;
    }
}

