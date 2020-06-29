package com.example.designpattern.singleton1;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author lgh on 2020/6/24 9:26
 * @description 解决静态内部类方法遇到序列化对象不能保证单例问题
 */
public class Singleton07_1 implements Serializable {

    private Singleton07_1() {

    }

    private static class SingleHolder {
        private static Singleton07_1 instance = new Singleton07_1();
    }

    public Singleton07_1 getInstance() {
        return SingleHolder.instance;
    }

    /**
     * 该方法在反序列化时会被调用，该方法不是接口定义的方法，有点儿约定俗成的感觉
     */
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法！");
        return SingleHolder.instance;
    }

}
