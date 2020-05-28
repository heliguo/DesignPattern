package com.example.designpattern.observer9;

/**
 * @author lgh on 2020/5/28 20:28
 * @description 事件源对象
 */
public abstract class Event<T> {

    public abstract T getSource();

}
