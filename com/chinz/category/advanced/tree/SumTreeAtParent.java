package com.chinz.category.advanced.tree;

import com.chinz.common.TNode;

import static com.chinz.common.TNode.printTree;

public class SumTreeAtParent {
    public static void main(String[] args) {
        System.out.println("Creating Binary Tree");
        TNode tNode = new TNode(10);
        tNode.left = new TNode(-2);
        tNode.right = new TNode(6);
        tNode.left.left = new TNode(8);
        tNode.left.right = new TNode(-4);
        tNode.right.left = new TNode(7);
        tNode.right.right = new TNode(5);
        findSumTree(tNode);
        printTree(tNode);
    }

    private static int findSumTree(TNode tNode) {
        if (tNode == null)
            return 0;
        int temp = tNode.data;
        tNode.data = findSumTree(tNode.left) + findSumTree(tNode.right);

        return temp + tNode.data;

    }
}
