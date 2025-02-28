package StringPractice;

import java.util.Scanner;

public class PrintUniqueCharacterGivenString {
public static void main(String[] args) {
	System.out.println("Enter a Strig");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	for(int i =0;i<s.length();i++) {
		boolean isunique =true;
		char ch =s.charAt(i);
		for(int j =0;j<s.length();j++) {
			if(i!=j && s.charAt(j)==ch) {
				isunique=false;
				break;
			}
		}
		if(isunique) {
			System.out.print(ch);
		}
	}
}
}
