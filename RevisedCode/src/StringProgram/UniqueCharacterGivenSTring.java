package StringProgram;

import java.util.Scanner;

public class UniqueCharacterGivenSTring {
public static void main(String[] args) {
	System.out.println("Enter a STring");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		boolean isUnique= true;
		for(int j =0;j<s.length();j++) {
			if(i!=j && s.charAt(j)==ch)isUnique= false;
		}
		if(isUnique) {
			System.out.println(ch);
		}
	}
}
}
