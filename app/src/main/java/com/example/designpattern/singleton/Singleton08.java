package com.example.designpattern.singleton;

/**
 * @author lgh on 2020/5/25 20:13
 * @description 枚举单例
 * 不进可以保证线程安全，还能防止反序列化（反射）
 */
public enum Singleton08 {

    INSTANCE;

}
