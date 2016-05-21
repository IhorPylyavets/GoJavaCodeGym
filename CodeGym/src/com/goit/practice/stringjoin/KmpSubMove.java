package com.goit.practice.stringjoin;

/*
* Циклічний Зсув
Дается строка в которой делается несколько циклических сдвигов
(под циклическим сдвигом понимается перенос последней буквы в начало)
Дается также получившаяся строка
нужно вернуть минимальное количество сдвигов(int) которым можно получить из 1-й строки итоговую
если строку получить циклическим сдвигом нельзя то вывести -1

Дано: abcd cdab ответ: 2
* */

public class KmpSubMove {
    public int subMoveQuantity(String inputStr, String resultStr) {
        if (inputStr.length() == 1) return 0;

        int countShift = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            inputStr = shift(inputStr);
            countShift += 1;

            if (inputStr.equals(resultStr)) {
                return countShift;
            }
        }

        if (!inputStr.equals(resultStr)) {
            return -1;
        }

        return countShift;
    }

    private String shift(String str) {
        return str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
    }
}
