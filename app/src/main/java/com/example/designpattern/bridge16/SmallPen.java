package com.example.designpattern.bridge16;

/**
 * author:lgh on 2020/6/7 15:33
 * 扩充抽象类
 */
class SmallPen extends Pen{

    @Override
    public void draw(String name) {
        String paintType = "小号毛笔绘制";
        this.color.bePaint(paintType,name);
    }
}
