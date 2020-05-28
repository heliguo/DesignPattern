package com.example.designpattern.flyweight11;

import java.util.UUID;

/**
 * @author lgh on 2020/5/28 21:18
 * @description 享元模式
 */
public class Bullet {

    public UUID id = UUID.randomUUID();
    public boolean isLiving = true;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                ", isLiving=" + isLiving +
                '}';
    }
}
