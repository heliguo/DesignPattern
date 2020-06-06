package com.example.designpattern.iterator12.v2;


import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * author:lgh on 2020/6/6 14:04
 * 链表实现
 */
class LinkList_ implements Collection_ {

    LinkedList<Object> mLinkedList = new LinkedList<>();
    Node               head        = null;
    Node               tail        = null;

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

    private class Node {

        Object o;
        Node   next;

        public Node(Object o) {
            this.o = o;
        }

    }

    public int size() {
        return size;
    }

    @Override
    public Iterator_ interator_() {
        return new LinkListIterator();
    }

    private class LinkListIterator implements Iterator_ {

        private int  currentIndex = 0;
        private Node currentNode;

        public LinkListIterator() {
            currentNode = head;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Object next() {
            if (!hasNext())
                throw new NoSuchElementException();
            Object o = currentNode.o;
            currentNode = currentNode.next;
            currentIndex++;
            return o;
        }
    }

}
