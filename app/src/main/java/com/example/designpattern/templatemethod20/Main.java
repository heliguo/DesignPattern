package com.example.designpattern.templatemethod20;

/**
 * author:lgh on 2020/6/7 10:59
 */
class Main {

    public static void main(String[] args) {
        F f = new C();
        f.op();
    }

    static abstract class F {

        void op() {//模板方法，规定两个方法的实现顺序
            op1();
            op2();
        }


        protected abstract void op1();

        protected abstract void op2();
    }

    static class C extends F {

        @Override
        protected void op1() {
            System.out.println("op1");
        }

        @Override
        protected void op2() {
            System.out.println("op2");
        }
    }
}
