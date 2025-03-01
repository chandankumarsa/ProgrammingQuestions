package StringProgram;

import java.util.Scanner;

public class ConvertUctoLc {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	String res ="";
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		
		if(ch[i]>='a'&& ch[i]<='z')ch[i]-=32;
		else if(ch[i]>='A'&& ch[i]<='Z')ch[i]+=32;
	}
	System.out.println(ch);
}
}
