package StringPractice;

import java.util.Scanner;

public class countAlphabet {
	public static void main(String[] args) {
		System.out.println("ENter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String res = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z') ||(ch >= 'A' && ch <= 'Z'))count++;
				
		}
		System.out.println(count);
	}
}
