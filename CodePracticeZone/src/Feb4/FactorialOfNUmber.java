package Feb4;
import java.util.Scanner;
public class FactorialOfNUmber {
	public static void main(String[] args) {
		System.out.println("ENter a number to calculate the factorial of a NUmber");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of a given Number is : " + fact);
	}
}
