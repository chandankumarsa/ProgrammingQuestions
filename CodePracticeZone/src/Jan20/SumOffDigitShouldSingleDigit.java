package Jan20;

import java.util.Scanner;

public class SumOffDigitShouldSingleDigit {
	public static void main(String[] args) {
		System.out.println("ENter a Number To Perform The SUm oF Digit Should BE in Single DIgit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Sum of the digit should be in single Digit is : "+sum(n));
	}
	static int sum(int n) {
		if(n>=0 && n<=9) {
			return n;
		}
		return sum(sumOfDigit(n));
	}
	static int sumOfDigit(int n) {
		if(n== 0)
		return 0;
		return n%10+sum(n/10);
	}

}
