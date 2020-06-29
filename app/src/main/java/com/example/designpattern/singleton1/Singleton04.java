package com.example.designpattern.singleton1;

/**
 * @author lgh on 2020/5/25 20:13
 * @description 按需加载，也称为懒汉模式 能保证单例
 * 通过synchronized来保证线程安全，带来了效率下降问题
 */
public class Singleton04 {

    private static Singleton04 INSTANCE;

    private Singleton04() {

    }

    public static synchronized Singleton04 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton04();
        }
        return INSTANCE;
    }

}
