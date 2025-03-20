package OOps_Practice;
class A {
	int i;
	A(int i) {
		this.i = i;
	}
}
class B{
	static A m1() {
		A a1 = new A(20);
		return a1;
	}
}
public class FactoryMethod {
	public static void main(String[] args) {
A a1 = B.m1();
System.out.println(a1.i);
	}
}
