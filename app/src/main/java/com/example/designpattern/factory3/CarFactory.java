package com.example.designpattern.factory3;

/**
 * @author lgh on 2020/5/26 20:54
 * @description 工厂方法
 * 可任意定制交通工具 继承Moveable
 * 可任意定制生产过程 Moveable xxxFactory.create()
 */
public class CarFactory {

//    public Car createCar() {
//        return new Car();
//    }

    public Moveable creat(){
        return new Car();
    }
}
