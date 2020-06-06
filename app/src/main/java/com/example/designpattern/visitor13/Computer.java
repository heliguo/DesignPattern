package com.example.designpattern.visitor13;

/**
 * author:lgh on 2020/6/6 15:31
 */
public class Computer {
    ComputerPart cpu = new Cpu();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();

    public void accept(Visitor visitor){
        System.out.println("11111");
        cpu.accept(visitor);
        memory.accept(visitor);
        board.accept(visitor);
    }

    public static void main(String[] args) {
        PersonalVisitor p = new PersonalVisitor();//创建一个访问者
        new Computer().accept(p);//接受访问者
        System.out.println(p.totalPrice);
    }
}
