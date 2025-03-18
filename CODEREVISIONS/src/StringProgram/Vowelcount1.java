package StringProgram;

import java.util.Scanner;

public class Vowelcount1 {
public static void main(String[] args) {
	System.out.println("ENter a STring");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int count =0;
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')count++;
	}
	System.out.println(count);
}
}
