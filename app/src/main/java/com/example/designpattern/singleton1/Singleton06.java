package com.example.designpattern.singleton1;

/**
 * @author lgh on 2020/5/25 20:13
 * @description 双重检查，可以保证单例 DCL
 */
public class Singleton06 {

    private volatile static Singleton06 INSTANCE;//防止指令重排

    private Singleton06() {

    }

    public static Singleton06 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton06.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton06();
                }
            }
        }
        return INSTANCE;
    }

}
