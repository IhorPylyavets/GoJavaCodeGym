package com.goit.practice.stringjoin;

public class FirstOddNumber {
    public int find(int[] input) {
        if(input.length==0) {
            return -1;
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i]%2 != 0)
                return i;
        }

        return -1;
    }
}
