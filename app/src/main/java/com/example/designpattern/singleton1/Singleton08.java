package com.example.designpattern.singleton1;

/**
 * @author lgh on 2020/5/25 20:13
 * @description 枚举单例
 * 不但可以保证线程安全，还能防止反序列化（反射）
 * 枚举类没有构造方法
 */
public enum Singleton08 {

    INSTANCE;

}
