package com.goit.practice.stringjoin;

/*
* Додайте два беззнакових числа, що передаються як рядки.
"101" + "100" = "1001"
* */

public class AddBinary {
    public String add(String first, String second) {
        StringBuilder stringBuilder = new StringBuilder();
        int inMemory = 0;

        if (first.length() < second.length()) {
            while(first.length() < second.length()) {
                first = 0 + first;
            }
        }
        else if (second.length() < first.length()) {
            while(second.length() < first.length()) {
                second = 0 + second;
            }
        }

        for(int i = first.length() - 1; i >= 0; i--){
            if (first.charAt(i) == '0' && second.charAt(i) == '0') {
                stringBuilder.append(inMemory);
                inMemory = 0;
            }
            else if( first.charAt(i) == '1' && second.charAt(i) == '1') {
                if (inMemory == 0) {
                    stringBuilder.append('0');
                }
                else {
                    stringBuilder.append('1');
                }
                inMemory = 1;
            }
            else if (first.charAt(i) == '1' || second.charAt(i) == '1') {
                if (inMemory == 0) {
                    stringBuilder.append('1');
                }
                else {
                    stringBuilder.append('0');
                    inMemory = 1;
                }
            }
        }

        if (inMemory == 1) {
            stringBuilder.append('1');
        }

        return stringBuilder.reverse().toString();
    }
}
