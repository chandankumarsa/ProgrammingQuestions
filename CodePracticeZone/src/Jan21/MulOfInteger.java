package Jan21;

import java.util.Scanner;

public class MulOfInteger {
	public static void main(String[] args) {
		System.out.println("Enter a Number to Perform The Multiplication Of integer");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Multiplication of An integr is : "+mul(n));
	}
	static int mul(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*mul(n-1);
	}

}
