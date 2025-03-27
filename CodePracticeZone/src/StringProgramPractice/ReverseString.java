package StringProgramPractice;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String res ="";
	for(int i =s.length()-1;i>=0;i--) {
		res+=s.charAt(i);
	}
	System.out.println(res);
	
}
}
