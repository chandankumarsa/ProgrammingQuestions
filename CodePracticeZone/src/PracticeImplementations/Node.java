package PracticeImplementations;

public class Node {
	Node prev;
	Node next;
	Object ele;

	Node(Object ele) {
		this.ele = ele;
	}

	Node(Node prev, Object ele, Node next) {
		this.prev = prev;
		this.ele = ele;
		this.next = next;
	}
}
