package com.goit.practice.stringjoin;

/*
*Найдовший Період Стабільності
Дано масив чисел в якому знаходяться значення ВВП за кожен місяць в мільярдах доларів США.
Необхідно знайти найдовший період стабільності.
Період стабільності - період часу де всі значення ВВП попарно відрізняються один від одного максимум на 1.
Повернути кількість місяців.
* */

public class LongestStabilityPeriod {
    public int count(int[] gdp) {
        if (gdp.length <= 1) return gdp.length;

        int resultPeriod = 1;
        int period = 1;
        int min = gdp[0];
        int max = gdp[0];
        int maxDifference = 1;
        boolean exit = false;

        for (int i = 1; i < gdp.length; i++) {
            if (Math.abs(gdp[i] - min) <= maxDifference && Math.abs(gdp[i] - max) <= maxDifference){
                period++;
                min = Math.min(gdp[i], min);
                max = Math.max(gdp[i], max);
            } else {
                if (exit) return resultPeriod;

                if (i == gdp.length - 1) exit = true;
                period = 1;
                max = gdp[i];
                min = gdp[i];
                while (Math.abs(gdp[i-1] - max) <= maxDifference && i > 0 && Math.abs(gdp[i-1] - min) <= maxDifference) {
                    max = Math.max(gdp[i-1], max);
                    min = Math.min(gdp[i-1], min);
                    i--;
                }
            }

            if (period > resultPeriod) resultPeriod = period;
        }

        return resultPeriod;
    }
}
