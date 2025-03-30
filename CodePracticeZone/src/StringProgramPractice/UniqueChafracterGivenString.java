package StringProgramPractice;

import java.util.Scanner;

public class UniqueChafracterGivenString {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	
	for(int i= 0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(s.charAt(i)==' ')continue;
		boolean isUnique = true;
		for(int j =0;j<s.length();j++) {
			if(i!=j && s.charAt(i)==s.charAt(j)) {
				isUnique=false;
				break;
			}
		}
		if (isUnique) {
			System.out.println(ch);
		}
	}
	
	
}
}
