package DoublyLinkedListPractice;

public class Node {
	Node next;
	Node prev;
	Object ele;

	public Node(Object ele) {
		this.ele = ele;
	}

	public Node(Node prev, Object ele, Node next) {
		this.prev = prev;
		this.ele = ele;
		this.next = next;
	}

}
