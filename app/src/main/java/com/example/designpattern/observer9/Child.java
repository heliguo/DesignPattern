package com.example.designpattern.observer9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgh on 2020/5/28 20:12
 * @description 被观察者
 */
public class Child {
    private boolean         isCry      = false;
    private List<IObserver> mObservers = new ArrayList<>();//观察者集合

    {
        mObservers.add(new Dad());
        mObservers.add(new Mum());
        mObservers.add(new Dog());//传入接口实现类

        mObservers.add(new IObserver() {
            @Override
            public void action(WakeUpEvent event) {

            }
        });
        //传入一个方法,与上面lambda一样
        mObservers.add((event)->
            System.out.println("hook 函数")
        );
    }

    public void wakeUp() {
        isCry = true;
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed", this);
        for (IObserver observer : mObservers) {//全部调用action方法
            observer.action(event);
        }

    }

}
