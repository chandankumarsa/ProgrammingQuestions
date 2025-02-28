package StringPractice;

import java.util.Scanner;

public class RemoveDuplicatecharacter {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	char ch[] =s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='\u0000')continue;;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				ch[j]='\u0000';
			}
		}
		System.out.print(ch[i]);
	}
}
}
