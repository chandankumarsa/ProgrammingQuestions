package com.chandan.LinkedListImplementations;
class LinkedListImp {
	Node head;
	int count = 0;
	public void add(Object ele) {
		if (head == null) {
			head = new Node(ele);
			count++;
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(ele, null);
		count++;
	}

	public int size() {
		return count;
	}

	public Object get(int index) {
		if (index < 0 || index >= size())  // Fixed condition
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());

		Node curr = head;
		for (int i = 0; i < index; i++) {  // Fixed loop condition
			curr = curr.next;
		}
		return curr.ele;
	}
}
public class Driver {
	public static void main(String[] args) {
		LinkedListImp l = new LinkedListImp();
		l.add(10);
		l.add(20);
		l.add("dhruva");
		l.add(true);
		System.out.println("Size: " + l.size());

		// Print all elements
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
}
