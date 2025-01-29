package Jan22;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		System.out.println("Enter a NUmber to Find Sum oF DIgit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Sum of Digit of a Given number is :"+sum(n));
	}
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+sum(n/10);
	}

}
