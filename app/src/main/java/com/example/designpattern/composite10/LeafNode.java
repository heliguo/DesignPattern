package com.example.designpattern.composite10;

/**
 * @author lgh on 2020/5/28 20:57
 * @description 叶子，没有节点
 */
public class LeafNode extends Node {

    private String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void p() {
        System.out.println(content);
    }
}
