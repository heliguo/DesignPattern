package com.example.designpattern.visitor13;

/**
 * author:lgh on 2020/6/6 15:29
 */
public class Cpu extends ComputerPart {

    @Override
    void accept(Visitor v) {
        System.out.println("2222");
        v.visitCpu(this);
    }

    @Override
    double price() {
        System.out.println("33333");
        return 1500;
    }
}
