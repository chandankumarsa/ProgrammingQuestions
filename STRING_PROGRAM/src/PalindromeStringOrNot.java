import java.util.Scanner;

public class PalindromeStringOrNot {
	public static void main(String[] args) {
		System.out.println("Enter a String to Check if the String is a Palindrome String or Not");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isPalindrome(s));
	}
	static boolean isPalindrome(String s) {
		int i =0;
		int j =s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
		
	}
}
