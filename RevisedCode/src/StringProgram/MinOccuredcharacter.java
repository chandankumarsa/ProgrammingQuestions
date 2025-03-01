package StringProgram;

import java.util.Scanner;

public class MinOccuredcharacter {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	String res ="";
	int mincount=s.length();
	char minchar =s.charAt(0);
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		int count =0;
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)==ch)count++;
		}
		if(count<mincount) {
			mincount=count;
			minchar=ch;
		}
	}
	System.out.println(minchar+" : "+mincount);
}
}
