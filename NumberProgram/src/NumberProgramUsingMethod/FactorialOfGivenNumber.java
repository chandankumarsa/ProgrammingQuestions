package NumberProgramUsingMethod;

import java.util.Scanner;

public class FactorialOfGivenNumber {
	public static void main(String[] args) {
		System.out.println("Enter a Number tO Find The Factorial");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial Of a Given Number is : "+ fact(n));
	}
	static int fact(int n ) {
		int fact =1;
		for(int i =1;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}

}
