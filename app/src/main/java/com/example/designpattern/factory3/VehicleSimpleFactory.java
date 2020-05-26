package com.example.designpattern.factory3;

/**
 * @author lgh on 2020/5/26 20:41
 * @description 简单工厂
 * 交通工具工厂类
 */
public class VehicleSimpleFactory {

    public Car createCar() {
        return new Car();
    }

    public Plane createPlane() {
        return new Plane();
    }

}
