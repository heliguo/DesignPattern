package com.example.designpattern.state21.v1;

/**
 * author:lgh on 2020/6/7 11:10
 */
class SadState extends MMState {
    @Override
    void smile() {

    }

    @Override
    void cry() {
        System.out.println("cry");
    }

    @Override
    void say() {

    }
}
