package Feb24StringProgram;

import java.util.Scanner;

public class CountmaxOccuredCharacter {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char maxch = s.charAt(0);
		int maxcount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)==ch)count++;
			}
			if(count >maxcount) {
				maxcount = count;
				maxch=ch;
			}
		}
		System.out.println(maxch +" : "+maxcount);

	}
}
