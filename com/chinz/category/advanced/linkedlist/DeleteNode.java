package com.chinz.category.advanced.linkedlist;

import com.chinz.common.LNode;

import static com.chinz.common.LNode.printLinkedList;

public class DeleteNode {
    public static void main(String[] args) {
        System.out.println("Creating linked list");
        LNode lNode = new LNode(1);
        lNode.next = new LNode(2);
        lNode.next.next = new LNode(3);
        lNode.next.next.next = new LNode(4);
        lNode.next.next.next.next = new LNode(5);

        printLinkedList(deleteNode(lNode, 1));
    }

    private static LNode deleteNode(LNode lNode, int data) {
        LNode curr = lNode;
        LNode prev = null;
        if(lNode.data == data){
            lNode = lNode.next;
        }else {
            while (curr.data != data) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
        }
        return lNode;
    }

}
