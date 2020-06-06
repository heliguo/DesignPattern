package com.example.designpattern.visitor13;

/**
 * author:lgh on 2020/6/6 15:30
 */
public class Board extends ComputerPart {
    @Override
    void accept(Visitor v) {
        v.visitBoard(this);
    }

    @Override
    double price() {
        return 400;
    }
}
