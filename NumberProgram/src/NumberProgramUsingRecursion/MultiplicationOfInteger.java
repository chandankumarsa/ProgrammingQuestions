package NumberProgramUsingRecursion;

import java.util.Scanner;

public class MultiplicationOfInteger {
	public static void main(String[] args) {
		System.out.println("Enter a Number To Find The Multiplication Of an Integer");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(mul(n));
				
	}
	static int  mul(int n ) {
		if(n==1) {
			return 1;
		}
		return n*mul(n-1);
	}

}
