package com.example.designpattern.iterator12.v1;


/**
 * author:lgh on 2020/6/6 14:04
 * 链表实现
 */
class LinkList_ implements Collection_{
    Node head = null;
    Node tail = null;

    private int size = 0;

    public void add(Object o) {
        Node n = new Node(o);
        n.next = null;

        if (head == null) {
            head = n;
            tail = n;
        }
        tail.next = n;
        tail = n;
        size++;
    }

    class Node {

        Object o;
        Node   next;

        public Node(Object o) {
            this.o = o;
        }

    }

    public int size() {
        return size;
    }
}
