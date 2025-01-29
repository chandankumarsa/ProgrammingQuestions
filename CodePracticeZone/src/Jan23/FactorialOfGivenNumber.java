package Jan23;

import java.util.Scanner;

public class FactorialOfGivenNumber {
	public static void main(String[] args) {
		System.out.println("ENter a Number to find the Factorial Of a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial of a Given Number is : "+fact(n));
	}
	static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

}
