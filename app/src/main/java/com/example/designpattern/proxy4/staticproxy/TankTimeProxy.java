package com.example.designpattern.proxy4.staticproxy;

import com.example.designpattern.proxy4.Moveable;

/**
 * @author lgh on 2020/5/30 9:47
 * @description
 */
public class TankTimeProxy implements Moveable {

    Moveable mTank;

    public TankTimeProxy(Moveable tank) {
        mTank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        mTank.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
