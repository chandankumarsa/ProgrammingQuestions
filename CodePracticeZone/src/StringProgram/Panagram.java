package StringProgram;

import java.util.Scanner;

public class Panagram {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	System.out.println(isPanagram(s));
}
static boolean isPanagram(String s) {
	if(s.length()<26)return false;
	for(char ch='a';ch<='z';ch++) {
		if(!s.contains(ch+""))return false;
	}
	return true;
	
}
}
