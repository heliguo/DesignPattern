package com.example.designpattern.strategy;

/**
 * @author lgh on 2020/5/25 21:00
 * @description 选择排序
 */
public class SelectionSort {

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                minPos = a[j] < a[minPos] ? j : minPos;
            }
            swap(a, i, minPos);
        }
    }

    private static void swap(int[] a, int i, int minPos) {
        int temp = a[i];
        a[i] = a[minPos];
        a[minPos] = temp;
    }

}
