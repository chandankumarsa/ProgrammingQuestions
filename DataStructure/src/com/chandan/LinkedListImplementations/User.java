package com.chandan.LinkedListImplementations;

public class User {
public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.display();   // Output: 10 20 30

	System.out.println(list.contains(20));  // Output: true
	System.out.println(list.contains(50));  // Output: false

	list.reverse();
	list.display();   // Output: 30 20 10
	list.addpos(69, 0);
	list.remove(0);
	list.display(); 

	System.out.println(list.isCircular());  // Output: false

}
}
