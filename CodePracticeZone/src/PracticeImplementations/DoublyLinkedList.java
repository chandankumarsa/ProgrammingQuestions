package PracticeImplementations;

public class DoublyLinkedList {
	Node head, tail;
	int count = 0;

	public void add(Object ele) {
		if (head == null) {
			addFirst(ele);
			return;
		}
		Node n = new Node(tail, ele, null);
		tail.next = n;
		tail = n;
	}

	public void addFirst(Object ele) {
		Node n = new Node(null, ele, head);
		if (head != null)
			head.prev = n;
		head = n;
		if (tail == null)
			tail = n;
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
		for(int  i=0;i<index;i++) {
			curr= curr.next;
		}
		return curr.ele;

	}

}
