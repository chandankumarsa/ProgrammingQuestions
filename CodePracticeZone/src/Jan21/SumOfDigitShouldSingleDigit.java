package Jan21;

import java.util.Scanner;

public class SumOfDigitShouldSingleDigit {
	public static void main(String[] args) {
		System.out.println("Enter a Number to Perform the Sum of Digit Should Be in Single Digit");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println("Sum of Digit Should Be in Single Digit is : "+findSum(n));
	}
	static int findSum(int n) {
		if(n>=0 && n<=9) {
			return n;
		}
		return findSum(sum(n));
	}
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n%10 +sum(n/10);
		
	}

}
