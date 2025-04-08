package LinkedlistImpl;

public class LinkedList {
	Node head;
	int count = 0;

	public void add(Object ele) {
		if (head == null) {
			addFirst(ele);
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(ele);
		count++;
	}

	public void addFirst(Object ele) {
		head = new Node(ele, head);
		count++;
		return;
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
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		return curr.ele;
	}
	public void getpos(int index,Object ele) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		
	}
}
