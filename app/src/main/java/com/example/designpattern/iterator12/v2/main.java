package com.example.designpattern.iterator12.v2;

/**
 * author:lgh on 2020/6/6 14:35
 */
class main {

    public static void main(String[] args) {
        Collection_ array = new LinkList_();
        array.add("1");
        array.add("2");
        System.out.println("size: " + array.size());
        Iterator_ interator_ = array.interator_();
        while (interator_.hasNext()) {
            Object next = interator_.next();
            System.out.println(next);
        }
    }
}
