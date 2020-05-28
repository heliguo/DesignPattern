package com.example.designpattern.observer9;

/**
 * @author lgh on 2020/5/28 20:10
 * @description
 */
public class Mum implements IObserver {

    public void hug(){
        System.out.println("mum action");
    }

    @Override
    public void action(WakeUpEvent event) {
        hug();
    }
}
