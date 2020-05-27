package com.example.designpattern.decorator7;

/**
 * @author lgh on 2020/5/27 20:26
 * @description
 */
public class BattercakeAddEggAddSausage extends BattercakeAddEgg {

    @Override
    public String getDesc() {
        return super.getDesc()+"加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
