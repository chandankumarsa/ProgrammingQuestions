package PracticeProgram18Jan;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		System.out.println("ENter a Number To Find The Sum Of DIgit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Sum Of Digit Of a Given Number is : "+sum(n));
	}
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+sum(n/10);
	}

}
