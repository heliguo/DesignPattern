package com.example.designpattern.state21.thread;

/**
 * author:lgh on 2020/6/7 11:23
 */
public class Thread_ {

    ThreadfState_ state;

    public void move(Action input) {
        state.move(input);
    }

    public void run() {
        state.run();
    }
}
