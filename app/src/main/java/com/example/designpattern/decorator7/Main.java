package com.example.designpattern.decorator7;

/**
 * author:lgh on 2020/6/7 15:55
 */
class Main {

    public static void main(String[] args) {
        /**
         * 装饰者
         */
        AbstractBattercake abstractBattercake;
        abstractBattercake = new BattercakeDec();
        abstractBattercake = new EggBattercakeDecorator(abstractBattercake);
        abstractBattercake = new SausageDecorator(abstractBattercake);
        System.out.println(abstractBattercake.getDesc() + abstractBattercake.cost());
    }
}
