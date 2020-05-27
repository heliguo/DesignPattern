package com.example.designpattern.decorator7;

/**
 * @author lgh on 2020/5/27 20:24
 * @description
 */
public class BattercakeAddEgg extends Battercake {

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
