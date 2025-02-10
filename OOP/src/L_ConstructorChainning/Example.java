package L_ConstructorChainning;

// Example of Constructor Chaining
class A {
	A(int i) {
		System.out.println("A() cons : " + i);
	}
}

class B extends A {
	B(int i) {
		super(i);
		System.out.println("B() cons : " + i);
	}
}

public class Example {
	public static void main(String[] args) {
		B b = new B(50);
	}
}
