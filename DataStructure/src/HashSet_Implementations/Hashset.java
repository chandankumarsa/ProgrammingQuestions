package HashSet_Implementations;
public class Hashset {
	int count = 0;
	Node a[] = new Node[10];

	public boolean add(Object ele) {
		int hc = Math.abs(ele.hashCode());
		int index = hc % a.length;
		if (a[index] == null) {
			a[index] = new Node(ele);
			count++;
			return true;
		}
		Node curr = a[index];
		while (curr.next != null) {
			if (curr.ele.equals(ele))
				return false;
			curr = curr.next;
		}
		if (curr.ele.equals(ele)) // fix: check last node for duplicate
			return false;
		curr.next = new Node(ele);
		count++;
		return true;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public void display() {
		for (int i = 0; i < a.length; i++) {
			Node curr = a[i];
			while (curr != null) {
				System.out.println(curr.ele);
				curr = curr.next;
			}
		}
	}

	public boolean contains(Object ele) {
		int hc = Math.abs(ele.hashCode());
		int index = hc % a.length;
		Node curr = a[index];
		while (curr != null) {
			if (curr.ele.equals(ele))
				return true;
			curr = curr.next;
		}
		return false;
	}
}
