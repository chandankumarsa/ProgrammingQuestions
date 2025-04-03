package com.chandan.LinkedListImplementations;
public class LinkedList {
    Node head;
    int count = 0;

    public void add(Object ele) {
        if (head == null) {
            addfirst(ele);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(ele);
        count++;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Object get(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
        Node curr = head;
        for (int i = 0; i < index; i++)
            curr = curr.next;

        return curr.ele;
    }

    public void addpos(Object ele, int index) {
        if (index < 0 || index > size())  // allow inserting at end
            throw new IndexOutOfBoundsException();

        if (index == 0) {
            addfirst(ele);
            return;
        }
        Node curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        Node n = new Node(ele, curr.next);
        curr.next = n;
        count++;
    }

    public void addfirst(Object ele) {
        head = new Node(ele, head);
        count++;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.ele);
            curr = curr.next;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        if (index == 0) {
            head = head.next;
            count--;
            return;
        }
        Node curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        count--;
    }
    
    
    
    
    
    //-------------------------------------------------------------------------------

    // **New method: Check if list contains an element**
    public boolean contains(Object ele) {
        Node curr = head;
        while (curr != null) {
            if (curr.ele.equals(ele)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    // **New method: Reverse the linked list**
    public void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
    }

    // **New method: Check if the linked list is circular**
    public boolean isCircular() {
        if (head == null) return false;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;  // Cycle detected
        }
        return false;
    }
}
