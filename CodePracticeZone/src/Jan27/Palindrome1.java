package Jan27;

import java.util.Scanner;

public class Palindrome1 {
	public static void main(String[] args) {
		System.out.println("Enter a number to check Palindrome Number or not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(ispalindrome(n, n, 0));
	}
	static boolean ispalindrome(int n,int m,int rev) {
		if(n==0)return m==rev;
		rev = (rev*10)+(n%10);
		return ispalindrome(n/10, m, rev);
	}

}
