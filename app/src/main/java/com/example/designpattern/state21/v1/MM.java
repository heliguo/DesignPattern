package com.example.designpattern.state21.v1;

/**
 * author:lgh on 2020/6/7 11:06
 * 新增状态不方便
 */
class MM {
    MMState mState;

    public void smile(){
        mState.smile();
    }

    public void cry(){
        mState.cry();
    }

    public void say(){
        mState.say();
    }
}
