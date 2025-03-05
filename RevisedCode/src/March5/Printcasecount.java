package March5;

import java.util.Scanner;

public class Printcasecount {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int lc=0,uc=0,sp=0,nc=0;
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		if(ch>='a'&& ch<='z')lc++;
		else if(ch>='A'&& ch<='Z')uc++;
		else if(ch>='0' && ch<='9')nc++;
		else sp++;
	}
	System.out.println("Uc count :"+uc);
	System.out.println("Lc count : "+lc);
	System.out.println("Nc count : "+nc);
	System.out.println("sp count : "+sp);
}
}
