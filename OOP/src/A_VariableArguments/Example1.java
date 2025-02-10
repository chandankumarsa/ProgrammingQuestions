package A_VariableArguments;
public class Example1 {
	public static void m1(int... a) {
		for (int n : a) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		m1(40, 50, 60);
	}

}
