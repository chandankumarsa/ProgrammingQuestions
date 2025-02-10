package M_MethodOverriding;
class A{
	void m1() {
		System.out.println("M1() - A");
	}
}
class B extends A{
	void m1() {
		System.out.println("M1() - B");
	}
}
public class Example1 {
public static void main(String[] args) {
	B  b = new B();
	b.m1();
}
}
