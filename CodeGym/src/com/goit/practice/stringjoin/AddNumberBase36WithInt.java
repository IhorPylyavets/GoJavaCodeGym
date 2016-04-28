package com.goit.practice.stringjoin;

/*
Дано 2 числа в системі числення з основою 36. Будь-яка цифра може бути в межах [0-9a-z].
Повернути суму чисел, також в системі 36.
Наприклад:
"9" + "1" = "a"
"z" + "1" = "10"
        */

public class AddNumberBase36WithInt {
    public String add(String a, String b) {
        int first = stringFromBase36ToInt(a);
        int second = stringFromBase36ToInt(b);

        return intToBase36(first + second);
    }

    /*
    * 0..9 48..57
    * A..Z 65..90
    * a..z 97..122
    * */
    public String intToBase36(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        int base = 36;

        int count = 1;
        int flag = number;

        for (;flag >= base; count++) {
            flag /= base;
        }

        for (int i = count-1; i >= 0; i--) {
            int index = 0;

            int power = 1;
            for (int j = 0; j < i; j++) {
                power*= base;
            }

            for (; number >= power;) {
                index += 1;
                number -= power;
            }

            if (index < 10) {
                stringBuilder.append(index);
            } else {
                stringBuilder.append(Character.toChars(87 + index));
            }
        }

        return stringBuilder.toString();
    }

    public int stringFromBase36ToInt(String base36) {
        int result = 0;
        int base = 36;

        char[] chars = base36.toCharArray();
        for (int i = chars.length-1, power = 0; i >= 0; i--, power++) {
            result += getBasisBase36(chars[i]) * baseInPower(base, power);
        }

        return result;
    }

    public int getBasisBase36(char c) {
        return Character.getNumericValue(c);
    }

    public int baseInPower(int base, int power) {
        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        return result;
    }
}
