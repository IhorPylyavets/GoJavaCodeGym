package com.goit.practice.stringjoin;

/*
* Парсер Числа
Дано рядок, що представляє певне чило. Необхідно повернути число.
Якщо це неможливо, повернути null
Наприклад:
"-2.e10"
"+.3"
".e2" повертає null
* */

public class Doubles {
    public Double parse(String s) {
        Double result = 0.0;
        if (s.contains("-") && s.contains("e")|| s.startsWith(".e")) {
            return null;
        } else if (s.equals("-.0") || s.equals("-0.")) {
            return 0.0;
        } else if (s.contains("+.") || s.contains("-.")) {
            return null;
        } else {
            result = Double.parseDouble(s);
        }
        return result;
    }
}
