package StringPractice;
import java.util.Scanner;
public class PalindromeWordGienString {
	public static void main(String[] args) {
		System.out.println("Enter a String ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String word[] = s.split(" ");
		for (String n : word) {
			if (isPalindrome(n)) {
				System.out.println(n);
			}
		}
	}
	static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
