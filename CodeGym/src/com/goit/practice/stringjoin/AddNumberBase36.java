package com.goit.practice.stringjoin;

/*
* Дано 2 числа в системі числення з основою 36. Будь-яка цифра може бути в межах [0-9a-z].
Повернути суму чисел, також в системі 36.
Наприклад:
"9" + "1" = "a"
"z" + "1" = "10"
* */
public class AddNumberBase36 {
    private static int Z_INDEX = 35;
    private static int A_INDEX_COEFISIENT = 87;

    public String add(String a, String b) {
        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();

        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        int inMemory = 0;

        int length = chars1.length;
        if (chars2.length > length) {
            length = chars2.length;
        }

        for (int i = 0, j = chars1.length-1, k = chars2.length-1; i < length; i++) {
            int result = 0;

            if (i <= j && i <= k) {
                result = getBasisBase36(chars1[i]) + getBasisBase36(chars2[i]) + inMemory;
            } else if (i > j) {
                result = getBasisBase36(chars2[i]) + inMemory;
            } else if (i > k) {
                result = getBasisBase36(chars1[i]) + inMemory;
            }

            if (result > Z_INDEX) {
                inMemory = result / (Z_INDEX + 1);
                result -= (Z_INDEX + 1) * inMemory;
            } else {
                inMemory = 0;
            }

            stringBuilder.append(getBas(result));
        }

        if (inMemory != 0) {
            stringBuilder.append(getBas(inMemory));
        }

        return stringBuilder.reverse().toString();
    }

    private int getBasisBase36(char c) {
        return Character.getNumericValue(c);
    }

    private String getBas(int index) {
        if (index < 10) {
            return String.valueOf(index);
        } else {
            return String.valueOf(Character.toChars(A_INDEX_COEFISIENT + index));
        }
    }
}
