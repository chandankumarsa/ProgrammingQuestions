package Jan23;

import java.util.Scanner;

class Book{
	String title;
	String author;
	double price;
	Book (String t,String a,double p){
		title=t;
		author =a;
		price =p;
	}
	void display() {
		System.out.println("title = \t"+title);
		System.out.println("author = \t"+author);
		System.out.println("price = \t"+price);
		System.out.println("------------------------");
	}
}
class Bookcreator{
	static Book getObject() {
		Scanner sc = new Scanner(System.in);
		System.out.println("title : ");
		String t = sc.next();
		System.out.println("Author : ");
		String a = sc.next();
		System.out.println("price");
		double d = sc.nextDouble();
		return new Book(t,a,d);
	}
}

public class Factory {
	public static void main(String[] args) {
		Book b1 = Bookcreator.getObject();
		b1.display();
	
	}

}
