package com.example.designpattern.prototype;

import androidx.annotation.NonNull;

/**
 * author:lgh on 2020/6/6 17:43
 */
class Location implements Cloneable {//标记性接口


    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
