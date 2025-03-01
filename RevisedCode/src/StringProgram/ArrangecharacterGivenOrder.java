package StringProgram;

import java.util.Scanner;

public class ArrangecharacterGivenOrder {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	String res ="";
	String uc="",lc="",sp="",nc="";
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		if(ch>='a'&& ch<='z')lc+=ch;
		else if(ch>='A'&& ch<='Z')uc+=ch;
		else if(ch>='0'&& ch<='9')nc+=ch;
		else sp+=ch;
	}
	res=uc+lc+sp+nc;
	
	System.out.println("nc  count is : "+res);
}
}
