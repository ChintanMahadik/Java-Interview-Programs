package com.chinz.category.advanced.tree;

import com.chinz.common.TNode;

public class LeftViewOfBST {

    static int maxDepth = 0;

    public static void main(String[] args) {
        System.out.println("Creating Binary Tree");
        TNode tNode = new TNode(5);
        tNode.left = new TNode(10);
        tNode.right = new TNode(7);
        tNode.left.left = new TNode(20);
        tNode.left.right = new TNode(30);
        tNode.left.right.left = new TNode(65);
        tNode.right.left = new TNode(2);
        tNode.right.right = new TNode(12);

        leftViewOfBST(tNode, 1);
    }

    private static void leftViewOfBST(TNode tNode, int index) {
        if (tNode == null)
            return;
        if (index > maxDepth) {
            maxDepth = index;
            System.out.println(tNode.data);
        }
            leftViewOfBST(tNode.left, index+1);
            leftViewOfBST(tNode.right, index+1);
    }
}
