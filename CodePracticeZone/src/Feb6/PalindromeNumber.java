package Feb6;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	System.out.println("ENter a Number to check if a Number is a Palindrome nUmber or not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int temp =n;
	int rev =0;
	while(n>0) {
		int rem = n%10;
		rev=rev*10+rem;
		n/=10;
	}
	if(rev==temp) {
		System.out.println(temp+ " :is A Palindrome Number");
	}else {
		System.out.println(temp+ " :is Not a Palindrome number");
	}
	
}
}
