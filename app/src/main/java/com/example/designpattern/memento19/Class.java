package com.example.designpattern.memento19;

import java.io.Serializable;

/**
 * author:lgh on 2020/6/7 10:45
 */
public class Class implements Serializable {
    private transient int a = 0;//不序列化
}
