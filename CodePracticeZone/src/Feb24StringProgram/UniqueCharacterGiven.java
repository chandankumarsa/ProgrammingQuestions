package Feb24StringProgram;

import java.util.Scanner;

public class UniqueCharacterGiven {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		boolean unique=true;
		for(int j=0;j<s.length();j++) {
			if(i!=j&& s.charAt(j)==ch) {
				unique=false;
				break;
			}
		}
		if(unique)System.out.println(ch);
	}
}
}
