package com.chinz.category.advanced.tree;

import com.chinz.common.TNode;

import static com.chinz.common.TNode.printTree;

public class LeastCommonParentBST {
    public static void main(String[] args) {
        System.out.println("Creating Binary Tree");
        TNode tNode = new TNode(10);
        tNode.left = new TNode(6);
        tNode.right = new TNode(20);
        tNode.left.left = new TNode(2);
        tNode.left.right = new TNode(8);
        tNode.right.left = new TNode(15);
        tNode.right.right = new TNode(25);

        System.out.println(lcp(tNode, 2, 8).data);

    }

    private static TNode lcp(TNode tNode, int v1, int v2) {
        if (tNode == null)
            return tNode;
        if (tNode.data == v1 || tNode.data == v2) {
            return tNode;
        } else if (tNode.data > v1 && tNode.data > v2) {
            return lcp(tNode.left, v1, v2);
        } else if (tNode.data < v1 && tNode.data < v2) {
            return lcp(tNode.right, v1, v2);
        }
        return tNode;
    }
}
