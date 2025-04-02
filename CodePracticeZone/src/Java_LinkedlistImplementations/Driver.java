package Java_LinkedlistImplementations;import javax.print.attribute.Size2DSyntax;
class LinkedList{
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
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		Node curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		return curr.ele;
	}
}
public class Driver {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(69);
		System.out.println(l.size());
		for(int i =0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
}

