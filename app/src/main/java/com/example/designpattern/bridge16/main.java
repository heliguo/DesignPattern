package com.example.designpattern.bridge16;

/**
 * author:lgh on 2020/6/6 17:22
 */
class main {

    public static void main(String[] args) {
        Pen smallBPen = new SmallPen();
        smallBPen.setColor(new Blue());
        smallBPen.draw("hahaha...");

        Pen bigRPen = new BigPen();
        bigRPen.setColor(new Red());
        bigRPen.draw("gagaga..");

        Pen middleGPen = new MiddlePen();
        middleGPen.setColor(new Green());
        middleGPen.draw("pupupu...");

    }
}
