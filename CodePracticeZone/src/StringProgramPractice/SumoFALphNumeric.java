package StringProgramPractice;

import java.util.Scanner;

public class SumoFALphNumeric {
	public static void main(String[] args) {
		System.out.println("ENter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String res = "";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9')
				sum += ch - '0';
		}
		System.out.println("Sum of Integer is : "+sum);
	}
}
