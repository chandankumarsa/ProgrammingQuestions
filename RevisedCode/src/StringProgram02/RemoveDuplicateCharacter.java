package StringProgram02;

import java.util.Scanner;

public class RemoveDuplicateCharacter {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	char ch[] = s.toCharArray();
	for(int i =0;i<ch.length;i++) {
		if(s.charAt(i)=='\u0000')continue;
		for(int j =i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				ch[j]='\u0000';
			}
		}
		System.out.println(ch[i]);
	}
}
}
