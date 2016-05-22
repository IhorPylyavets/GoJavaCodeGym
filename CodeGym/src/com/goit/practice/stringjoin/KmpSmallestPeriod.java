package com.goit.practice.stringjoin;

/*
*Найменший Період

A character string is said to have period k if it can be formed by concatenating one or more repetitions of another string of length k.
For example, the string "abcabcabcabc" has period 3, since it is formed by 4 repetitions of the string "abc".
It also has periods 6 (two repetitions of "abcabc") and 12 (one repetition of "abcabcabcabc").
Write a program to read a character string and determine its smallest period
Return (String) substring;
* */

public class KmpSmallestPeriod {
    public String findSmalletstPeriod(String input) {
        int[] prefix = prefixFunction(input);

        int t = input.length() - prefix[prefix.length - 1];
        String result = "";

        if (t > 0) {
            for (int i = 0; i < t; i++) {
                result += input.charAt(i);
            }
        }

        return result;
    }

    private int[] prefixFunction(String s) {
        int[] p = new int[s.length()];
        int k = 0;
        for (int i = 1; i < s.length(); i++) {
            while (k > 0 && s.charAt(k) != s.charAt(i))
                k = p[k - 1];
            if (s.charAt(k) == s.charAt(i)) {
                k += 1;
            }
            p[i] = k;
        }
        return p;
    }
}
