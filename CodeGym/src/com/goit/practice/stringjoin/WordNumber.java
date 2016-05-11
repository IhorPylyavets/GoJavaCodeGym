package com.goit.practice.stringjoin;

/*
* Дано рядок. Порахувати кількість слів.
Словом вважається послідовність символів англійського алфавіту [a-zA-Z].
Алгоритм повинен працювати за O(N) часу, тому RegExp використовувати не можна.
* */

public class WordNumber {
    public int count(String input) {
        if (input.length() == 0) return 0;

        String[] arr = input.split(" ");
        int count = 0;

        for (String word : arr) {
            if (isWord(word)) {
                count += 1;
            }
        }

        return count;
    }

    private boolean isWord(String word) {
        char[] wordArray = word.toCharArray();

        for (int i = 0; i < wordArray.length; i++) {
            if (!((wordArray[i] >= 'A' && wordArray[i] <= 'Z') || (wordArray[i] >= 'a' && wordArray[i] <= 'z'))) {
                return false;
            }
        }

        return true;
    }
}
