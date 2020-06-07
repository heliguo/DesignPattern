package com.example.designpattern.state21.thread;

/**
 * author:lgh on 2020/6/7 11:22
 */
class RunningState extends ThreadfState_ {

    Thread_ t;

    public RunningState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        if (input.msg.equals("newstate")) {
            input.msg = "runningstate";
            t.state = new TerminatedState(t);
        }

    }

    @Override
    void run() {
        System.out.println("running state...");
    }
}
