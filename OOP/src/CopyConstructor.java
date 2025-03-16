class Rectangle {
	int length;
	int bredth;

	Rectangle(int l, int b) {
		this.length = l;
		this.bredth = b;
	}
	Rectangle(Rectangle r){
		length =r.length;
		bredth =r.bredth;
	}
	void disp() {
		System.out.println("Length :- "+length+"Bredth:- "+bredth);
	}
}

public class CopyConstructor {
public static void main(String[] args) {
	Rectangle r1= new Rectangle(10,20);
	r1.disp();
	Rectangle r2 = new Rectangle(r1);
	r2.disp();
}

}
