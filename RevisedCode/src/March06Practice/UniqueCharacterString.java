package March06Practice;

import java.util.Scanner;

public class UniqueCharacterString {
public static void main(String[] args) {
	System.out.println("Enter a String : ");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		boolean isunique  =true;
		for(int j =0;j<s.length();j++) {
			while(i!=j && s.charAt(j)==ch) {
				isunique=false;
				break;
			}
		}
		if(isunique)System.out.print(ch);
	}
}
}
