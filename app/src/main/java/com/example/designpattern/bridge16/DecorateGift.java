package com.example.designpattern.bridge16;

/**
 * author:lgh on 2020/6/6 17:19
 */
class DecorateGift extends Gift {
    public DecorateGift(GiftImpl gift) {
        this.gift = gift;
    }
}
