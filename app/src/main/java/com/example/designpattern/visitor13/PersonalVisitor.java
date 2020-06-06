package com.example.designpattern.visitor13;

/**
 * author:lgh on 2020/6/6 15:34
 */
public class PersonalVisitor implements Visitor {

    public double totalPrice;

    public void visitMemory(Memory memory) {
        System.out.println("444");
        totalPrice += memory.price() * 0.8;

    }

    public void visitCpu(Cpu cpu) {
        System.out.println("444444");
        totalPrice += cpu.price() * 0.9;
    }

    public void visitBoard(Board board) {
        System.out.println("4444444444");
        totalPrice += board.price() * 0.9;
    }


}
