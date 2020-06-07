package com.example.designpattern.bridge16;

/**
 * author:lgh on 2020/6/7 15:31
 * 抽象类
 */
public abstract class Pen {

    protected Color_ color;

    public void setColor(Color_ color) {
        this.color = color;
    }

    public abstract void draw(String name);

}
