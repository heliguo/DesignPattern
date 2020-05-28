package com.example.designpattern.observer9;

/**
 * @author lgh on 2020/5/28 20:08
 * @description
 */
public class Dad implements IObserver {

    public void feed(){
        System.out.println("dad action");
    }

    @Override
    public void action(WakeUpEvent event) {
        feed();
    }
}
