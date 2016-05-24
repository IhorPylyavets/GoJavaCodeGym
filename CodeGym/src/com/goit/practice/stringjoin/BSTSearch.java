package com.goit.practice.stringjoin;

/*
Пошук в "Бінарному Дереві Пошуку"
Знайти число в бінарному дереві пошуку і повернути true якщо воно присутнє, інакше повернути false.
* */

public class BSTSearch {
    public boolean exist(TreeNode root, int target) {
        if (root == null) return false;

        while (root.value != target) {
            if (target > root.value) {
                root = root.right;
            } else {
                root = root.left;
            }

            if (root == null) return false;
        }
        return true;
    }

    private class TreeNode {
        int value;
        TreeNode left, right;
    }
}
