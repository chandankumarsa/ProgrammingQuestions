package Java_LinkedlistImplementations;

public class Node {
Node next;
Object ele;
public Node(Object ele) {
	this.ele =ele;
}
public Node(Object ele,Node next) {
	this.ele= ele;
	this.next= next;
}

}
