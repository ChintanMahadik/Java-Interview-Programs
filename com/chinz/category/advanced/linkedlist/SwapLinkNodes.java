package com.chinz.category.advanced.linkedlist;

import com.chinz.common.LNode;

import static com.chinz.common.LNode.printLinkedList;

public class SwapLinkNodes {
    public static void main(String[] args) {
        System.out.println("Creating linked list");
        LNode lNode = new LNode(1);
        lNode.next = new LNode(2);
        lNode.next.next = new LNode(3);
        lNode.next.next.next = new LNode(4);
        lNode.next.next.next.next = new LNode(5);

        printLinkedList(swapNodes(lNode, 1, 4));
    }

    private static LNode swapNodes(LNode lNode, int x, int y) {
        LNode currX = lNode;
        LNode prevX = null;
        LNode currY = lNode;
        LNode prevY = null;

        //Find prev & currLocation of Data x
        while (currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        //Find prev & currLocation of Data y
        while (currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        //Checking for Node if data has no previous Node
        if(prevX == null){
            lNode=currY;
        }else {
            prevX.next = currY;
        }

        if(prevY == null){
            lNode=currX;
        }else {
            prevY.next = currX;
        }

        LNode temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return lNode;
    }
}
