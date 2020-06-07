package com.example.designpattern.observer9;

/**
 * @author lgh on 2020/5/28 20:11
 * @description
 */
public class Dog implements IObserver {

    public void wang(){
        System.out.println("dog action");
    }

    @Override
    public void action(WakeUpEvent event) {
        System.out.println(event.loc);
        wang();
    }

}
