package com.example.designpattern.visitor13;

/**
 * author:lgh on 2020/6/6 15:26
 */
public abstract class ComputerPart {

    abstract void accept(Visitor v);

    abstract double price();
}
