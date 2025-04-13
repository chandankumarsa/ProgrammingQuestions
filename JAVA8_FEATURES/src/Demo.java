import java.util.function.Predicate;

public class Demo {
	public static void main(String[] args) {
		int n = 7;
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(n));
	}
}
