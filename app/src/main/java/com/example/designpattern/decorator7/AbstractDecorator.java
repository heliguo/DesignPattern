package com.example.designpattern.decorator7;

/**
 * @author lgh on 2020/5/27 20:30
 * @description 依赖倒置
 * 注入AbstractBattercake实例作为getDesc、cost依赖
 */
public class AbstractDecorator extends AbstractBattercake {

    private AbstractBattercake mDecorate;

    AbstractDecorator(AbstractBattercake decorate) {
        mDecorate = decorate;
    }

    @Override
    public String getDesc() {
        return this.mDecorate.getDesc();
    }

    @Override
    public int cost() {
        return this.mDecorate.cost();
    }
}
