package StringPractice;

import java.util.Scanner;

public class MaxOccuredCharacter {
public static void main(String[] args) {
	System.out.println("ENter a STring");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	char maxchar=s.charAt(0);
	int maxcount=0;
	
	for(int i=0;i<s.length();i++) {
		int count =0;
		char ch =s.charAt(i);
		
		for(int j =0;j<s.length();j++) {
			if(s.charAt(j)==ch)count++;
		}
		if(count >maxcount) {
			maxcount =count;
			maxchar =ch;
		}
	}
	System.out.println(maxchar +":"+maxcount);
}
}
