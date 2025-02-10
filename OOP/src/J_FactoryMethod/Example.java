package J_FactoryMethod;
class X {
	int i;
	X(int i) {
		this.i = i;
	}
}
class Y {// Factory class
	static X m1() { // factory Method
		X x1 = new X(50); // create object and return object from Method
		return x1;
	}
}

public class Example {
	public static void main(String[] args) {
		X x1 = Y.m1();
		System.out.println(x1.i);
	}
}
//factory Methods Are always static and it should be Present within the same class