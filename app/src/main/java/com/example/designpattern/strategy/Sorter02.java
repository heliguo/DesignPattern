package com.example.designpattern.strategy;

/**
 * @author lgh on 2020/5/25 21:09
 * @description 使用策略模式
 * 比较任意对象大小
 */
public class Sorter02 {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                minPos = a[j].compareTo(a[minPos]) == -1 ? j : minPos;
            }
            swap(a, i, minPos);
        }
    }

    private static void swap(Comparable[] a, int i, int minPos) {
        Comparable temp = a[i];
        a[i] = a[minPos];
        a[minPos] = temp;
    }
}
