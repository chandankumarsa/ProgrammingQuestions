package DoublyLinkedListPractice;

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
		count++;
	}

	public void addFirst(Object ele) {
		Node n = new Node(null, ele, head);
		if (head != null) {
			head.prev = n;
			head = n;
		}
		if (tail == null)
			tail = n;
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
		for (int i = 0; i < index; i++) {
			curr = curr.next;

		}
		return curr.ele;
	}

	public void addpos(int index, Object ele) {
		if (index < 0 || index > size())
			throw new IndexOutOfBoundsException();
		if (index == 0) {
			addFirst(ele);
			return;
		} else if (index == size()) {
			add(ele);
			return;
		}
		Node curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		Node n = new Node(curr, ele, curr.next);
		curr.next.prev= n;
		curr.next= n;
		count++;
	}
	public void remove(int index) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		if (index == 0) {
			head = head.next;
			if(head!= null)head.prev= null;
			else tail = null;
			count--;
			return;
		}
		Node curr = head;
		for(int i =0;i<index;i++) {
			curr = curr.next;
		}
		curr.prev.next= curr.next;
		if(curr.next!=null)curr.next.prev= curr.prev;
		else tail = curr.prev;
		count--;
		
	}
}
