package com.chinz.common;

public class TNode {
    private int data;
    private TNode left;
    private TNode right;

    public TNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}