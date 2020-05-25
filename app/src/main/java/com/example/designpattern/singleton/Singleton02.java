package com.example.designpattern.singleton;

/**
 * @author lgh on 2020/5/25 20:13
 * @description 同Singleton01
 */
public class Singleton02 {

    private static final Singleton02 INSTANCE;

    static {
        INSTANCE = new Singleton02();
    }

    private Singleton02() {

    }

}
