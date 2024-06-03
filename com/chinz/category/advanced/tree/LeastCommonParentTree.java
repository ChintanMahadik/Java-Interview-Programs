package com.chinz.category.advanced.tree;

import com.chinz.common.TNode;

public class LeastCommonParentTree {
    public static void main(String[] args) {
        System.out.println("Creating Binary Tree");
        TNode tNode = new TNode(5);
        tNode.left = new TNode(10);
        tNode.right = new TNode(7);
        tNode.left.left = new TNode(20);
        tNode.left.right = new TNode(30);
        tNode.right.left = new TNode(2);
        tNode.right.right = new TNode(12);

        System.out.println(lcpOfTree(tNode, 2, 12).data);

    }

    private static TNode lcpOfTree(TNode tNode, int v1, int v2) {
        if (tNode == null)
            return tNode;
        if (tNode.data == v1 || tNode.data == v2) {
            return tNode;
        }

        TNode leftLcp = lcpOfTree(tNode.left, v1, v2);
        TNode rightLcp = lcpOfTree(tNode.right, v1, v2);

        //It should return when both LCP matches at a Node level.
        if (leftLcp != null && rightLcp != null) {
            return tNode;
        }

        //This returns the matched node to its parent if present.
        return (leftLcp != null) ? leftLcp : rightLcp;

    }
}
