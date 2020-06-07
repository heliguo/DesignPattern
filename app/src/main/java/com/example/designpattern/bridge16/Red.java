package com.example.designpattern.bridge16;

/**
 * author:lgh on 2020/6/7 15:39
 */
class Red extends Color_ {
    @Override
    public void bePaint(String paintType, String name) {
        System.out.println(paintType + "红色的"+ name + ".");
    }
}
