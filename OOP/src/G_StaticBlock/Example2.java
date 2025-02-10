package G_StaticBlock;

public class Example2 {
public static void main(String[] args) {
	System.out.println(" Execution Starts ");
	B.m1();
	B.m1();
	System.out.println("Execution End");
}
}
class B{
	static {
		System.out.println("Static block in B");
	}
	static void m1() {
		System.out.println("Static m1() in B");
	}
}
