package StringPractice;

import java.util.Scanner;

public class PalindromeWordGivenString {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	String words[]=s.split(" ");
	for(int i =0;i<words.length;i++) {
		if(isPalindrome(words[i])) {
			System.out.println(words[i]);
		}
	}
}
static boolean isPalindrome(String s) {
	int i=0;
	int j =s.length()-1;
	while(i<j) {
		if(s.charAt(i)!=s.charAt(j))return false;
		i++;
		j--;
	}
	return true;
}
}
