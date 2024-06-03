package com.chinz.common;

public class TNode {
     public int data;
     public TNode left;
     public TNode right;

    public TNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void printTree(TNode tNode) {
        if(tNode==null){
            return;
        }
        System.out.println(tNode.data);
        printTree(tNode.left);
        printTree(tNode.right);
    }
}