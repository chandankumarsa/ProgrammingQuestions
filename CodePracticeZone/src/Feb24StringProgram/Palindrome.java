package Feb24StringProgram;

import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	System.out.println("Enter something");
	Scanner sc =new Scanner(System.in);
	String s = sc.nextLine();

	System.out.println(isPalindrome(s));
}
static boolean isPalindrome(String s) {
	int i=0;
	int j =s.length()-1;
	while(i<j) {
		while(s.charAt(i)!=s.charAt(j))return false;
		i++;
		j--;
	}
	return true;
}
}
