package StringProgram02;

import java.util.Scanner;

public class MaxoccuredCharacter {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int maxcount =0;
	char maxchar=s.charAt(0);
	for(int i =0;i<s.length();i++) {
		int count =0;
		char ch =s.charAt(i);
		for(int j =0;j<s.length();j++) {
			if(s.charAt(j)==ch) {
				count++;
			}
		}
		if(count>maxcount) {
			maxcount=count;
			maxchar=ch;
		}
	}
	System.out.println(maxchar +" :"+maxcount);
}
}
