package com.goit.practice.stringjoin;

public class AverageNumber {
    public int average(int a, int b) {
        if (a%2 != 0 && b%2 != 0) {
            return (a/2 + b/2) + (a%2 + b%2)/2;
        }
        return (a/2 + b/2);
    }
}
