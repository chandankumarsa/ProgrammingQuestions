package Jan20;

import java.util.Scanner;

public class FIndFactorial {
	public static void main(String[] args) {
		System.out.println("Enter a Numebr To Find Factorial");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial Of a Given Number is : "+fact(n));
	}
	static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

}
