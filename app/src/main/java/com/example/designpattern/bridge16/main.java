package com.example.designpattern.bridge16;

/**
 * author:lgh on 2020/6/6 17:22
 */
class main {

    public static void main(String[] args) {
        Gift gift = new ClothesGift(new Skirt());//裙子
        Gift gift1 = new DecorateGift(new Earrings());//耳环
    }
}
