package com.example.designpattern.visitor13;

/**
 * author:lgh on 2020/6/6 15:27
 */
public interface Visitor {

    void visitMemory(Memory memory);

    void visitCpu(Cpu cpu);

    void visitBoard(Board board);
}
