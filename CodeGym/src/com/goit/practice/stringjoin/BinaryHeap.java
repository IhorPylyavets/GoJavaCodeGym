package com.goit.practice.stringjoin;

/*
* Бінарна Купа
Реалізуйте структуру даних  - Бінарна Купа (Binary Heap).
Конструктор приймає один параметр size.
Методи insert(int) що працює за O(logN) і poll(),
який видаляє і повертає максимальне число з купи і також працює за O(logN).
* */

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap {
    public List<Integer> heap = new ArrayList<>();
    public int size;

    public BinaryHeap(int size) {
        this.size = size;
    }

    public void insert(int value) {
        if (heap.size() == 0) {
            heap.add(value);
            return;
        } else if (value >= heap.get(heap.size() - 1)) {
            heap.add(value);
            return;
        } else if (value <= heap.get(0)) {
            heap.add(0, value);
            return;
        }
    }

    public int poll() {
        return heap.remove(heap.size() - 1);
    }
}
