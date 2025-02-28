package Feb25PracticeString;

import java.util.Scanner;

public class OccuranceofEachCharacter {
	public static void main(String[] args) {
		System.out.println("ENter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '\u0000')
				continue;
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\u0000';

				}
			}
			System.out.println(ch[i] +" : "+ count);
		}

	}
}
