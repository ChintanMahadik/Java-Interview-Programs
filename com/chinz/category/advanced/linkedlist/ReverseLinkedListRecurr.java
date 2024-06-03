package com.chinz.category.advanced.linkedlist;

import com.chinz.common.LNode;

import static com.chinz.common.LNode.printLinkedList;

public class ReverseLinkedListRecurr {
    public static void main(String[] args) {
        System.out.println("Creating linked list");
        LNode lNode = new LNode(1);
        lNode.next = new LNode(2);
        lNode.next.next = new LNode(3);
        lNode.next.next.next = new LNode(4);
        lNode.next.next.next.next = new LNode(5);

        printLinkedList(reverseListRecurr(lNode));
    }

    private static LNode reverseListRecurr(LNode lNode) {
        if(lNode.next == null){
            return lNode;
        }

        LNode node = reverseListRecurr(lNode.next);
        lNode.next.next = lNode;
        lNode.next= null;
        return node;
    }
}
