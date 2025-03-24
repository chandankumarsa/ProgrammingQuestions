package StringProgramByRamanaSir;

import java.util.Scanner;

public class occurrencesOfEachCharacter {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		int count =0;
		for(int j =0;j<s.length();j++) {
			if(ch==s.charAt(j))count ++;
		}
		System.out.println(ch+": "+count);
	}
	
}
}
