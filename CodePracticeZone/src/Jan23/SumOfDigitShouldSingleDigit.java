package Jan23;

import java.util.Scanner;

public class SumOfDigitShouldSingleDigit {
public static void main(String[] args) {
	System.out.println("ENter a NUmber To Calculate the sum of the Digit should be in single DIgit");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Sum of The Digit should be in single Digit is : "+findsum(n));
}
static int findsum(int n) {
	if(n>=0 && n<=9) {
		return n;
	}
	return findsum(sum(n));
}
static int sum(int n) {
	if(n==0) {
		return 0;
	}
	return n%10+sum(n/10);
}
}
