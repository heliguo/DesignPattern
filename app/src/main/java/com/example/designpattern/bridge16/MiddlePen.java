package com.example.designpattern.bridge16;

/**
 * author:lgh on 2020/6/7 15:36
 * 扩充抽象类
 */
public class MiddlePen extends Pen {

    public void draw(String name) {
        String penType = "中号毛笔绘制";
        this.color.bePaint(penType, name);

    }
}
