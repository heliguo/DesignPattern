package com.example.designpattern.iterator12.v1;

import java.util.ArrayList;

/**
 * author:lgh on 2020/6/6 13:51
 * 相比数组，该容器不需考虑边界问题，可动态扩展
 */
class ArrayList_ implements Collection_ {

    ArrayList<String> mList   = new ArrayList<>();
    Object[]          objects = new Object[10];
    //容器下一个空的位置
    private int index = 0;

    public void add(Object o) {
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }

        objects[index] = o;
        index++;
    }

    public int size() {
        return index;
    }


}
