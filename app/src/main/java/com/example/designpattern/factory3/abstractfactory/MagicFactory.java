package com.example.designpattern.factory3.abstractfactory;

/**
 * @author lgh on 2020/5/26 21:22
 * @description 该工厂可生产 MushRoom、Broom、MagicStick
 */
public class MagicFactory extends AbstractFactory {

    @Override
    public Food createFood() {
        return new MushRoom();
    }

    @Override
    public Vehicle creatVehicle() {
        return new Broom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }
}
