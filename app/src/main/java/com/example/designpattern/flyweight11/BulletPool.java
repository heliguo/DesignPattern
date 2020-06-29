package com.example.designpattern.flyweight11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgh on 2020/5/28 21:19
 * @description
 */
public class BulletPool {

    List<Bullet> mBullets = new ArrayList<>();

    {
        for (int i = 0; i < 5; i++) {
            mBullets.add(new Bullet());
        }
    }

    public Bullet getBullet() {
        for (int i = 0; i < mBullets.size(); i++) {
            Bullet bullet = mBullets.get(i);
            if (!bullet.isLiving) {
                return bullet;
            }
        }
        return new Bullet();
    }

}
