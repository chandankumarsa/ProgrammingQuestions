package I_CopyConstructor;

import org.w3c.dom.css.Rect;

class Rectangle{
	int length;
	int bredth;
	Rectangle(int l,int b){
		length= l;
		bredth= b;
	}
	Rectangle(Rectangle r) {
		length=r.length;
		bredth=r.bredth;
	}
	void display() {
		System.out.println("Length "+length+"  Bredth "+bredth);
	}
}
public class Example2 {
public static void main(String[] args) {
	Rectangle r1 = new Rectangle(10,20);
	r1.display();
	Rectangle r2 = new Rectangle(r1);
	r2.display();
}
}
