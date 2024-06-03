package com.chinz.category.advanced.linkedlist;

import com.chinz.common.LNode;

import static com.chinz.common.LNode.printLinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        System.out.println("Creating linked list");
        LNode lNode = new LNode(1);
        lNode.next = new LNode(2);
        lNode.next.next = new LNode(3);
        lNode.next.next.next = new LNode(4);
        lNode.next.next.next.next = new LNode(5);

        printLinkedList(reverseList(lNode));
    }

    private static LNode reverseList(LNode lNode) {
        LNode prev=null;
        LNode curr= lNode;
        LNode next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
