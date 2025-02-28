package StringPractice;

import java.util.Scanner;

public class ConvertUppertoLowercase {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	char ch[] =s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]>='a'&& ch[i]<='z')ch[i]-=32;
		else if(ch[i]>='A'&& ch[i]<='Z')ch[i]+=32;
	}
	System.out.println(ch);
}
}
