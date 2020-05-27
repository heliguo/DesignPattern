package com.example.designpattern.decorator7;

/**
 * @author lgh on 2020/5/27 20:28
 * @description 实体煎饼
 * 而鸡蛋、香肠都继承抽象装饰类AbstractDecorator
 */
public class BattercakeDec extends AbstractBattercake {
    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 6;
    }
}
