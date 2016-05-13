package com.goit.practice.stringjoin;

/*
* Дано рядок. Порахувати кількість слів.
Словом вважається послідовність символів англійського алфавіту [a-zA-Z].
Алгоритм повинен працювати за O(N) часу, тому RegExp використовувати не можна.
* */

public class WordNumber {
    public int count(String input) {
        int result = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (isCharLetter(input.charAt(i))) {
                stringBuilder.append(input.charAt(i));
            } else {
                if (stringBuilder.length() > 0) {
                    result++;
                    stringBuilder = new StringBuilder();
                }
            }
        }

        if (stringBuilder.length() > 0) {
            result++;
        }

        return result;
    }

    private boolean isCharLetter(char c) {
        return  ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }
}
