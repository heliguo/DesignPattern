package com.example.designpattern.singleton;

/**
 * @author lgh on 2020/5/25 20:13
 * @description 懒汉模式 不能保证单例
 * 线程不安全
 */
public class Singleton03 {

    private static Singleton03 INSTANCE;

    private Singleton03() {

    }

    public static Singleton03 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }

}
