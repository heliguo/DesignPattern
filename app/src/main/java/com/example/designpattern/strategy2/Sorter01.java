package com.example.designpattern.strategy2;

/**
 * @author lgh on 2020/5/25 21:09
 * @description 使用策略模式
 * 比较任意对象大小
 */
public class Sorter01 {
    public static void sort(Cat[] a) {
        for (int i = 0; i < a.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                minPos = a[j].compareTo(a[minPos]) == -1 ? j : minPos;
            }
            swap(a, i, minPos);
        }
    }

    private static void swap(Cat[] a, int i, int minPos) {
        Cat temp = a[i];
        a[i] = a[minPos];
        a[minPos] = temp;
    }
}
