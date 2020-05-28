package com.example.designpattern.composite10;

/**
 * @author lgh on 2020/5/28 21:08
 * @description 递归打印树状结构
 */
public class TreePrint {

    public static void print(Node node, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        node.p();

        if (node instanceof BranchNode) {
            for (Node node1 : ((BranchNode) node).mNodeList) {
                print(node1, depth + 1);
            }
        }

    }

}
