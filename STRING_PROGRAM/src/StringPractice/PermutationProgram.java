package StringPractice;

import java.util.Scanner;

public class PermutationProgram {
public static void main(String[] args) {
	System.out.println("Enter a String");
String s ="abc";
	isPermutations(s, 0, s.length());
}
static void isPermutations(String s,int st,int end) {
	if(st==end) {
		System.out.println(s);
		return;
	}
	for(int i =st;i<end;i++) {
		String s1 =swap(s, st, i);
		isPermutations(s1, st+1, end);
	}
}
static String swap(String s,int i,int j) {
	char ch[]=s.toCharArray();
	char temp =ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
	return new String(ch);
}
}
