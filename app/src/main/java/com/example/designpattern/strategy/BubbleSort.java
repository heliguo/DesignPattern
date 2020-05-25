package com.example.designpattern.strategy;

/**
 * @author lgh on 2020/5/25 20:52
 * @description 冒泡排序
 */
public class BubbleSort {

    public static void sort(int[] a) {
        //只需排 a.length-1 次
        for (int i = a.length - 1; i > 0; i--) {
            findMax(a, i);
        }
    }

    private static void findMax(int[] a, int n) {
        for (int j = 0; j < n; j++) {
            if (a[j] > a[j + 1]) {
                swap(a, j, j + 1);
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }

    }

}
