package Feb24StringProgram;

import java.util.Scanner;

public class MinimumOccuredCharacter {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	char minch =s.charAt(0);
	int mincount =s.length();
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		int count =0;
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)==ch) {
				count++;
			}
		}
		if(count <mincount) {
			mincount=count;
			minch=ch;
		}
		
	}
	System.out.println(minch +" : "+mincount);
}
}
