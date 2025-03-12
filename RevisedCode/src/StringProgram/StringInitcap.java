package StringProgram;

import java.util.Scanner;

public class StringInitcap {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(i==0 || ch[i-1]==' ') {
			if(ch[i]>='a'&& ch[i]<='z')ch[i]-=32;
		}
	}
	System.out.println(new String(ch));
}
}
