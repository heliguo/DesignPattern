package com.example.designpattern.singleton1;

/**
 * @author lgh on 2020/5/25 20:13
 * @description 相当于没有加锁不能解决线程安全 不能保证单例
 */
public class Singleton05 {

    private static Singleton05 INSTANCE;

    private Singleton05() {

    }

    public static Singleton05 getInstance() {
        if (INSTANCE == null) {//相当于没有加锁不能解决线程安全
            //此时可能会
            synchronized (Singleton05.class) {
                INSTANCE = new Singleton05();
            }
        }
        return INSTANCE;
    }

}
