package com.example.designpattern.singleton1;

/**
 * @author lgh on 2020/5/25 20:13
 * @description 静态内部类 可以保证单例
 * 加载外部类时不会初始化，可以保证懒加载
 * 但遇到序列化对象时，默认的方式运行得到的结果就是多例的
 */
public class Singleton07 {

    private static class Singleton07Holder {
        private static Singleton07 INSTANCE = new Singleton07();
    }

    private Singleton07() {

    }

    public static Singleton07 getInstance() {

        return Singleton07Holder.INSTANCE;
    }


}
