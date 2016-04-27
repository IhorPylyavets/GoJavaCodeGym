package com.goit.practice.stringjoin;

/*
 * Дано рядок отриманий шляхом заміни цифр 0,1,2,...,9 певного числа на букви a,b,c,..,j.
Необхідно повернути початкове число маючи конвертований рядок.
Наприклад:
Для "bcd" повернути 123
 */
public class AbcNumber {
    public int convert(String number) {
        number = number.toLowerCase();

        char[] chars = number.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : chars) {
            stringBuilder.append(Character.getNumericValue(c)-10);
        }

        return Integer.parseInt(stringBuilder.toString());
    }
}
