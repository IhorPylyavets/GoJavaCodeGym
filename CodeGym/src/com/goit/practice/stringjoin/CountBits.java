package com.goit.practice.stringjoin;

public class CountBits {
    public int count(int number){
        int count = 0;

        for(int i = 0; i < 32 && number != 0; i++){
            if( (number&1) == 1) {
                count++;
            }
            number = number >>> 1;
        }

        return count;
    }
}

