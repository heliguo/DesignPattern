package com.example.designpattern.state21.thread;

/**
 * author:lgh on 2020/6/7 11:22
 */
class NewState extends ThreadfState_ {

    Thread_ t;

    public NewState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        input.msg = "newstate";
        t.state = new RunningState(t);
    }

    @Override
    void run() {
        System.out.println("new state run...");
    }
}
