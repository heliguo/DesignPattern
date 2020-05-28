package com.example.designpattern.composite10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgh on 2020/5/28 20:58
 * @description 分支，有子节点
 */
public class BranchNode extends Node {

    private String name;

    List<Node> mNodeList = new ArrayList<>();

    public BranchNode(String name) {
        this.name = name;
    }

    @Override
    public void p() {
        System.out.println(name);
    }

    public void add(Node node) {
        mNodeList.add(node);
    }
}
