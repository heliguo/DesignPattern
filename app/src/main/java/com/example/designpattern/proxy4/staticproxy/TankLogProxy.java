package com.example.designpattern.proxy4.staticproxy;

import com.example.designpattern.proxy4.Moveable;

/**
 * @author lgh on 2020/5/30 9:56
 * @description 使用moveable 可以嵌套
 */
public class TankLogProxy implements Moveable {

    Moveable mMoveable;

    public TankLogProxy(Moveable moveable) {
        mMoveable = moveable;
    }

    @Override
    public void move() {
        System.out.println("start...");
        mMoveable.move();
        System.out.println("end...");
    }
}
