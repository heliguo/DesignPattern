package com.example.designpattern.singleton1;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author lgh on 2020/5/25 20:04
 * @description 饿汉模式 可保证单例
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 */
public class Singleton01 implements Serializable {

    private static final Singleton01 INSTANCE = new Singleton01();

    //保证外界无法初始化
    private Singleton01() {

        //        try {
        //            Class<?> singleton01 = Class.forName("Singleton01");//会初始化
        //        } catch (ClassNotFoundException e) {
        //            e.printStackTrace();
        //        }
    }

    public static Singleton01 getInstance() {
        return INSTANCE;
    }

    /**
     * 单例类当实现了 Serializable 接口后，反序列化时单例会被破坏，
     * 此时需要重写 readResolve，才能保证其反序列化依旧是单例
     */
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }

}
