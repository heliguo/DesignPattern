package com.example.designpattern.strategy;

/**
 * @author lgh on 2020/5/25 21:19
 * @description 使用compareTo接口
 */
public class Car implements MyComparable<Car> {

    private int weight, height;

    public Car(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Car o) {
        if (this.weight < o.weight)
            return -1;
        else if (this.weight > o.weight)
            return 1;
        else
            return 0;
    }
}
