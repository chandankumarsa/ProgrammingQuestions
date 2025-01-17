package NumberProgram;

import java.util.Scanner;

public class FactorialProgram {
	public static void main(String[] args) {
		System.out.println("Enter a Number To find The Factorial");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int fact =1;
		for(int i =1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial Of a Given Number is : "+fact);
		
	}

}
