package DoublyLinkedListImplimentations_CorrectVersion;

public class Node {
	Node next;
	Node prev;
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
