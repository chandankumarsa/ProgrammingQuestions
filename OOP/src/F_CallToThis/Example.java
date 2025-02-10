package F_CallToThis;

class B {
	B() {
		System.out.println("No Arg Constructor");
	}

	B(int i) {
		System.out.println("int Arg Constructor");
	}

	B(int i, int j) {
		this(i);
		System.out.println("2 int Arg Constructor");
	}
}

public class Example {
	public static void main(String[] args) {
		new B();
		new B(10, 20);
	}
}
