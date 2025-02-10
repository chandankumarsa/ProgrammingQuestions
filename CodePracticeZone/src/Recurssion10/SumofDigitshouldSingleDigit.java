package Recurssion10;

import java.util.Scanner;

import Jan31.DigitCount;

public class SumofDigitshouldSingleDigit {
public static void main(String[] args) {
	System.out.println("ENter a Number to calculate the sum of Digit Should be in single DIgit");
	Scanner sc = new Scanner(System.in);
	int  n = sc.nextInt();
	System.out.println("Sum of DIgit Should be in single DIgit is : "+ digit(n));
}
static int digit(int n) {
	if(n>=0 && n<=9) {
		return n;
	}
	return digit(sum(n));
}
static int sum(int n) {
	if(n==0)return 0;
	return n%10 + sum(n/10);
	
}
}
