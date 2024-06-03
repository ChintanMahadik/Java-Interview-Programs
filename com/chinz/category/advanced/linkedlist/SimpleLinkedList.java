package com.chinz.category.advanced.linkedlist;

import com.chinz.common.LNode;

import static com.chinz.common.LNode.printLinkedList;

public class SimpleLinkedList {
    public static void main(String[] args) {
        System.out.println("Creating linked list");
        LNode lNode = new LNode(1);
        lNode.next = new LNode(2);
        lNode.next.next = new LNode(3);
        printLinkedList(lNode);
    }


}