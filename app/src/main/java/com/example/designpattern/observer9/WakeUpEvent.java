package com.example.designpattern.observer9;

/**
 * @author lgh on 2020/5/28 20:15
 * @description 事件类 fire event
 */
public class WakeUpEvent extends Event<Child> {

    long   timeStamp;
    String loc;
    Child  source;

    public WakeUpEvent(long timeStamp, String loc, Child source) {
        this.timeStamp = timeStamp;
        this.loc = loc;
        this.source = source;
    }


    @Override
    public Child getSource() {
        return source;
    }
}
