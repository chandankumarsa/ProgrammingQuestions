package StringProgram02;

import java.util.Scanner;

public class CountAplhabet {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				count++;

		}
		System.out.println("count Alphabet : " + count);

	}
}
