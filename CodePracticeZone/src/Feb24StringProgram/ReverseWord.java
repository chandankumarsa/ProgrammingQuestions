package Feb24StringProgram;

import java.util.Scanner;

public class ReverseWord {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	System.out.println(rev(s));
}
static String rev(String s) {
	int i =0;
	int j =0;
	String res ="";
	while(j<s.length()) {
	while(j<s.length() && s.charAt(j)!=' ')j++;
	int k =j-1;
	while(k>=i) {
		res+=s.charAt(k);
		k--;
	}
	if(j<s.length())res+=" ";
	j++;
	i=j;
	}
	return res;
}
}
