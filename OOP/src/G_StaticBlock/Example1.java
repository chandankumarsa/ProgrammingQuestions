package G_StaticBlock;

public class Example1 {
	static {
		System.out.println("Static block");
		main(null);
	}
public static void main(String[] args) {
	System.out.println(" Main() ");
}
}
