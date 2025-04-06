package DSA_implementations;

public class Node {
Node next;
Object ele;
public Node(Object ele) {
	this.ele = ele;
}
public Node(Object ele,Node next) {
	this.next = next;
	this.ele = ele;
}

}
