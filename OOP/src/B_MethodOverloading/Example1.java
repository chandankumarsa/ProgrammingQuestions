package B_MethodOverloading;

public class Example1 {
	public static void main() {
		System.out.println("main()");
	}
	public static void main(int a) {
		System.out.println("main(int a)");
	}
	public static void main(double d) {
		System.out.println("main(double d)");
	}
public static void main(String[] args) {
	main();
	main(10);
	main(9.5);
}
}
