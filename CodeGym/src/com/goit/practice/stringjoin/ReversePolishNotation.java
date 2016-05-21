package com.goit.practice.stringjoin;

import java.util.Stack;

/*
*Польський Інверсний Запис
Дано арифметичний вираз у вигляді Польського Інверсного запису.
Необхідно обчислити значення виразу і повернути його.
Вираз складається лише з цілих чисел і операцій +, -, *, /. Гарантується, що результат також ціне число.
* */
public class ReversePolishNotation {
    public int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] arraySymbols = expression.split(" ");
        Math math = new Math();

        for (int i = 0; i < arraySymbols.length; i++) {
            if (checkString(arraySymbols[i])) {
                stack.push(Integer.parseInt(arraySymbols[i]));
            } else {
                int a = stack.pop();
                int b = stack.pop();

                ExpressionElementType type = ExpressionElementType.stringToType(arraySymbols[i]);

                if (type == ExpressionElementType.PLUS) stack.push(math.add(a, b));
                if (type == ExpressionElementType.MINUS) stack.push(math.subtract(a, b));
                if (type == ExpressionElementType.MULTIPLY) stack.push(math.multiply(a, b));
                if (type == ExpressionElementType.DIVIDE) stack.push(math.divide(a, b));
            }
        }

        return stack.pop();
    }

    private boolean checkString(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (str.length() == 1) {
                return false;
            }
            i = 1;
        }

        char c;
        for (; i < str.length(); i++) {
            c = str.charAt(i);
            if (!isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isDigit(char c) {
        return "0123456789".indexOf(c) != -1;
    }

    private class Math {
        public int add(int a, int b){
            return a + b;
        }

        public int subtract(int a, int b){
            return b - a;
        }

        public int multiply(int a, int b){
            return a * b;
        }

        public int divide(int a, int b){
            return b / a;
        }
    }

    public enum ExpressionElementType {

        PLUS, MINUS, MULTIPLY, DIVIDE;

        @Override
        public String toString() {
            switch (this) {
                case PLUS:
                    return "+";
                case MINUS:
                    return "-";
                case MULTIPLY:
                    return "*";
                case DIVIDE:
                    return "/";
            }
            return null;
        }

        public static ExpressionElementType stringToType(String type) {
            if (type.equals("+")) return PLUS;
            else if (type.equals("-")) return MINUS;
            else if (type.equals("*")) return MULTIPLY;
            else if (type.equals("/")) return DIVIDE;
            else return null;
        }
    }
}
