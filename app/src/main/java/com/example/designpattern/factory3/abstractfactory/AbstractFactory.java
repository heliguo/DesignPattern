package com.example.designpattern.factory3.abstractfactory;

/**
 * @author lgh on 2020/5/26 21:14
 * @description 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract Food createFood();

    public abstract Vehicle creatVehicle();

    public abstract Weapon createWeapon();

}
