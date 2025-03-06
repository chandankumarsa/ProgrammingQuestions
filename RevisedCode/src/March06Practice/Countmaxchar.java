package March06Practice;

import java.util.Scanner;

public class Countmaxchar {
	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int max = 0;
		char maxchar = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			char ch = s.charAt(i);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					count++;
			}
			if (count > max) {
				max = count;
				maxchar = ch;
			}
		}
		System.out.println(maxchar+" : "+max);

	}
}
