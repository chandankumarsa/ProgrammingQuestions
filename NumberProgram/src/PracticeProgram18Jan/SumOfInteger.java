package PracticeProgram18Jan;

import java.util.Scanner;

public class SumOfInteger {
	public static void main(String[] args) {
		System.out.println("ENter a Number To Perform the Sum of Integer");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Sum of Inter No Of a given Number iS : "+sum(n));
		
	}
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n+sum(n-1);
	}

}
