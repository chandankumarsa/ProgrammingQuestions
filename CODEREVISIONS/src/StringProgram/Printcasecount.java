package StringProgram;

import java.util.Scanner;

public class Printcasecount {
public static void main(String[] args) {
	System.out.println("ENter a STring");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int uc =0,lc=0,nc=0,sp=0;
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		if(ch>='a'&& ch<='z')lc++;
		else if(ch>='A'&&ch<='Z')uc++;
		else if(ch>='0'&&ch<='9')nc++;
		else sp++;
	}
	System.out.println("Uc : "+uc);
	System.out.println("Lc : "+lc);
	System.out.println("Nc : "+nc);
	System.out.println("Sc : "+sp);
}
}
