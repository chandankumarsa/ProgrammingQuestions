package StringProgram;

import java.util.Scanner;

public class MinOccuranceofCharacter {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int mincount =s.length();
	char minchar =s.charAt(0);
	for(int i =0;i<s.length();i++) {
		int count =0;
		char ch =s.charAt(i);
		for(int j =0;j<s.length();j++) {
			if(s.charAt(j)==ch)count++;
		}
		if(count<mincount) {
			mincount=count;
			minchar =ch;
		}
	}
	System.out.println(minchar+": "+mincount);
}
}
