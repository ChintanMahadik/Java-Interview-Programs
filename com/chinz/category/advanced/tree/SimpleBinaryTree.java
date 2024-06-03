package com.chinz.category.advanced.tree;

import com.chinz.common.TNode;

import static com.chinz.common.TNode.printTree;

public class SimpleBinaryTree {
    public static void main(String[] args) {
        System.out.println("Creating Binary Tree");
        TNode tNode = new TNode(10);
        tNode.left = new TNode(6);
        tNode.right = new TNode(20);
        tNode.left.left = new TNode(2);
        tNode.left.right = new TNode(8);
        tNode.right.left = new TNode(15);
        tNode.right.right = new TNode(25);

        printTree(tNode);

    }


}
