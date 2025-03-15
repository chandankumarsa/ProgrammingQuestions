package StringProgram;

import java.util.Scanner;

public class CountAlphabet {
public static void main(String[] args) {
	System.out.println('2'-'0'+'2'-'0');
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int count =0;
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		if(ch>='a'&& ch<='z')count++;
	}
	System.out.println("Count Alphabet is : "+count);
}
}
