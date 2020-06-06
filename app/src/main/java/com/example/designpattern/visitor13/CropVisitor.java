package com.example.designpattern.visitor13;

/**
 * author:lgh on 2020/6/6 15:34
 */
public class CropVisitor implements Visitor {

    public double totalPrice;

    public void visitMemory(Memory memory) {

        totalPrice += memory.price() * 0.7;

    }

    public void visitCpu(Cpu cpu) {
        totalPrice += cpu.price() * 0.8;
    }

    public void visitBoard(Board board) {
        totalPrice += board.price() * 0.8;
    }


}
