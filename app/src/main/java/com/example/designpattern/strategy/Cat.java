package com.example.designpattern.strategy;

import java.util.Comparator;

/**
 * @author lgh on 2020/5/25 21:08
 * @description 如何对该类排序
 */
public class Cat {

    private int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat c) {
        if (this.weight < c.weight)
            return -1;
        else if (this.weight > c.weight)
            return 1;
        else
            return 0;
    }
}
