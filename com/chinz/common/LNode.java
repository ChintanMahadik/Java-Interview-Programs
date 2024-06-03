package com.chinz.common;

public class LNode {
    public int data;
    public LNode next;

    public LNode(int data) {
        this.data = data;
        this.next = null;
    }

    public static void printLinkedList(LNode lNode) {
        System.out.print("Start");
        while(lNode!= null){
            System.out.print("-> " +lNode.data);
            lNode = lNode.next;
        }
    }
}