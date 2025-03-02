package StringProgram02;

import java.util.Scanner;

public class Printcasecount {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	int uc =0;int lc=0;int sp =0;int nc=0;
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		if(ch>='a'&& ch<='z')lc++;
		else if(ch>='A'&& ch<='Z')uc++;
		else if(ch>='0'&& ch<='9')nc++;
		else sp++;
	}
	System.out.println("uc count : "+uc);
	System.out.println("lc count : "+lc);
	System.out.println("nc count : "+nc);
	System.out.println("sp count : "+sp);

}
}
