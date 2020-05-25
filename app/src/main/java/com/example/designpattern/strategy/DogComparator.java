package com.example.designpattern.strategy;

/**
 * @author lgh on 2020/5/25 21:46
 * @description 使用策略模式可以随意修改策略内容（返回的值时可变得）
 */
public class DogComparator implements MyComparator<Dog> {

    @Override
    public int compare(Dog a, Dog b) {
        if (a.food < b.food)
            return -1;
        else if (a.food > b.food)
            return 1;
        else
            return 0;
    }
}
