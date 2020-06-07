package com.example.designpattern.state21.v1;

/**
 * author:lgh on 2020/6/7 11:10
 */
class HappyState extends MMState {
    @Override
    void smile() {
        System.out.println("happy");
    }

    @Override
    void cry() {

    }

    @Override
    void say() {

    }
}
