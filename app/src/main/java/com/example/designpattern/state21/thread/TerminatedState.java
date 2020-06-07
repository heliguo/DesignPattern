package com.example.designpattern.state21.thread;

/**
 * author:lgh on 2020/6/7 11:22
 */
class TerminatedState extends ThreadfState_ {

    private Thread_ t;

    public TerminatedState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        if (input.msg.equals("runningstate")) {
            input.msg = "terminatedstate";
        }
    }

    @Override
    void run() {
        System.out.println("terminated state..");
    }
}
