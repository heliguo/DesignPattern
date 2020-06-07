package com.example.designpattern.bridge16;

/**
 * author:lgh on 2020/6/7 15:38
 */
class Blue extends Color_ {
    @Override
    public void bePaint(String paintType, String name) {
        System.out.println(paintType + "蓝色的"+ name + ".");
    }
}
