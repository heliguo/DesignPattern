package com.example.designpattern.visitor13;

/**
 * author:lgh on 2020/6/6 15:29
 */
public class Memory extends ComputerPart {
    @Override
    void accept(Visitor v) {
        v.visitMemory(this);
    }

    @Override
    double price() {
        return 500;
    }
}
