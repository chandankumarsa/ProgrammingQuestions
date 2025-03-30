package StringProgramPractice;

import java.util.Scanner;

public class RemoveDuplicateElementGivenString {
public static void main(String[] args) {
	System.out.println("ENter a String to Remove Duplicate Character");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	char ch[]=s.toCharArray();
	for(int i =0;i<s.length();i++) {
		if(ch[i]=='\u0000')continue;
		for(int j =i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				ch[j]='\u0000';
			}
		}
		System.out.println(ch[i]);
	}
}
}
