package DSA_implementations;

public class Linkedlist {
	Node head;
	int count = 0;

	public void addfirst(Object ele) {
		head = new Node(ele, head);
		count++;
		return;
	}

	public void add(Object ele) {
		if (head == null) {
			addfirst(ele);
			count++;
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next= new Node(ele);
		count++;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count ==0;
	}
	public Object get(int index) {
		if(index<0|| index>=size())throw new IndexOutOfBoundsException();
		Node curr = head;
		for(int i =0;i<index;i++) {
			curr = curr.next;
		}
		return curr.ele;
	}
	public void addpos(int index,Object ele) {
		if(index<0|| index>=size())throw new IndexOutOfBoundsException();
		if(index==0) {
			addfirst(ele);
			count++;
			return;
		}
		Node curr = head;
		for(int i=1;i<index;i++) {
			curr = curr.next;
		}
		Node n = new Node(ele,curr.next);
		curr.next=n;
		count++;		
	}
	public void remove(int index) {
		if(index<0|| index>=size())throw new IndexOutOfBoundsException();
		if(index==0) {
			head = head.next;
			count--;
			return;
		}
		Node curr = head;
		for(int i=1;i<index;i++) {
			curr = curr.next;
		}
		curr.next= curr.next.next;
		count--;
	}
}
