package com.goit.practice.stringjoin;

/*
* В країні гномів прийнято, що більша порція їжі дістається вищому гному.
Дано два мисиви int[] довжиною N, з висотами гномів в першому і кілограмами їжі в другому.
Для кожного i-го гнома треба знайти j-ту порцію їжі і записати в результат j-індекси.
Приклад:
[5, 7, 6, 9, 4] - гноми
[8, 5, 6, 2, 3] - порції
Найвищому гному з висотою 9 дістається найбільша порція 8 з індексом 0.
Другий за висотою гном (7), отримує другу завбільшки порцію (6) з індексом 2, і т.д.
Найнищий (4) отримує найменшу порцію 2 (індекс 3)
Резульнат
[4, 2, 1, 0, 3]
* */

public class GnomeFood {
    public int[] find(int[] gnomes, int[] portions) {
        int[] result = new int[gnomes.length];

        for (int i = 0; i < gnomes.length; i++) {
            result[searchValue(gnomes)] = searchValue(portions);
        }

        return result;
    }

    private int searchValue(int[] array) {
        int indexMax = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > array[indexMax]){
                indexMax = i;
            }
        }
        array[indexMax] = 0;

        return indexMax;
    }
}
