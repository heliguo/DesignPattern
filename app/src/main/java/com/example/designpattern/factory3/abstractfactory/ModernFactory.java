package com.example.designpattern.factory3.abstractfactory;

/**
 * @author lgh on 2020/5/26 21:21
 * @description 该工厂可生产bread、car、Ak47
 */
public class ModernFactory extends AbstractFactory {

    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Vehicle creatVehicle() {
        return new Car1();
    }

    @Override
    public Weapon createWeapon() {
        return new Ak47();
    }
}
