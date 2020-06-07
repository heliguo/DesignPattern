package com.example.designpattern.composite10;

/**
 * author:lgh on 2020/6/7 16:00
 */
class Main {

    public static void main(String[] args) {
        /**
         * 组合模式
         */
        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        Node c11 = new LeafNode("c11");
        Node c12 = new LeafNode("c12");
        BranchNode b21 = new BranchNode("section21");
        Node c211 = new LeafNode("c211");
        Node c212 = new LeafNode("c212");

        root.add(chapter1);
        root.add(chapter2);

        chapter1.add(c11);
        chapter1.add(c12);

        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);

        TreePrint.print(root,0);
    }
}
