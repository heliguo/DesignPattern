package com.example.designpattern.iterator12.v2;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author lgh on 2020/6/6 13:51
 * @description 相比数组，该容器不需考虑边界问题，可动态扩展
 */
public class ArrayList_ implements Collection_ {

    ArrayList<String> mList   = new ArrayList<>();
    Object[]          objects = new Object[10];
    /**
     * 容器下一个空的位置
     */
    private int index = 0;

    @Override
    public void add(Object o) {
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }

        objects[index] = o;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator_ interator_() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator_ {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < index;
        }

        @Override
        public Object next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            Object object = objects[currentIndex];
            currentIndex++;
            return object;
        }
    }


}
