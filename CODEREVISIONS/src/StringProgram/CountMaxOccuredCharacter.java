package StringProgram;

import java.util.Scanner;

public class CountMaxOccuredCharacter {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int max = 0;
		char maxchar = s.charAt(max);
		for(int i =0;i<s.length();i++) {
			char ch =s.charAt(i);
			int count =0;
			for(int j =0;j<s.length();j++) {
				if(s.charAt(j)==ch)count++;
			}
			if(count>max) {
				max = count;
				maxchar=ch;
			}
		}
		System.out.println(maxchar+": "+max);
	}
}
