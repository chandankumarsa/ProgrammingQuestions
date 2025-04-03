package com.chandan.DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail; // Ensure tail is maintained properly
    int count;

    public void add(Object ele) {
        if (head == null) {
            head = new Node(ele);
            tail = head; // Ensure tail is also initialized
        } else {
            Node curr = tail; // Use tail to optimize traversal
            tail = new Node(curr, ele, null);
            curr.next = tail;
        }
        count++; // Increase count for every addition
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.ele);
            curr = curr.next;
        }
    }

    public void reverseDisplay() {
        Node curr = tail;
        while (curr != null) {
            System.out.println(curr.ele);
            curr = curr.prev;
        }
    }
}
