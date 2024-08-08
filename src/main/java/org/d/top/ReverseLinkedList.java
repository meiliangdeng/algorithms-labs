package org.d.top;


import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class ReverseLinkedList {
    private static void revertList(ListNode parent,ListNode node){
        if (node == null || node.next == null){
            return;
        }
        revertList(node,node.next);
        node.next = parent;
    }

    private static ListNode revertListNew(ListNode node){
        if (node == null || node.next == null){
            return node;
        }
        ListNode newNode = revertListNew(node.next);
        node.next.next = node;
        node.next = null;
        return newNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode newNode = revertListNew(head);

        while (newNode != null) {
            System.out.print(newNode.val + " ");
            newNode = newNode.next;
        }
    }
}
