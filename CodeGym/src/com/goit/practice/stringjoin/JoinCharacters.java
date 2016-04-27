package com.goit.practice.stringjoin;

/*
* З'єднати масив символів в число.
Приклад:
Для [ '1', '2', '3'] повернути 123
* */

public class JoinCharacters {
    public int join(char[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            result = result*10 + (input[i]-'0');
        }
        return result;
    }
}
