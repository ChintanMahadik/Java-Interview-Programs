package com.chinz.category.advanced.tree;

import com.chinz.common.TNode;

import static com.chinz.common.TNode.printTree;
import static java.lang.Math.max;

public class DepthOfTree {
    public static void main(String[] args) {
        TNode tNode = new TNode(10);
        tNode.left = new TNode(6);
        tNode.right = new TNode(20);
        tNode.left.left = new TNode(2);
        tNode.left.right = new TNode(8);
        tNode.right.left = new TNode(15);
        tNode.right.right = new TNode(25);
        tNode.right.right.left = new TNode(18);

        System.out.println("Depth of Binary Tree: ");
        System.out.println(depthOfTree(tNode));
    }

    private static int depthOfTree(TNode tNode) {
        if(tNode == null){
            return 0;
        }
        int leftDepth = 1 + depthOfTree(tNode.left);
        int rightDepth = 1 + depthOfTree(tNode.right);

        return max(leftDepth,rightDepth);
    }
}
