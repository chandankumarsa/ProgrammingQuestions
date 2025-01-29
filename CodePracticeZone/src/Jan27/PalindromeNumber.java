package Jan27;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	System.out.println("ENter a Number to check Palindrome number or not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(isPalindrome(n, n, 0));
}
public static boolean isPalindrome(int n,int m,int rev) {
	if(n==0)return m==rev;
	rev = (rev*10)+(n%10);
	return isPalindrome(n/10, m, rev);
	
}
}
