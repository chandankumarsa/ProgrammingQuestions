package StringProgram;

import java.util.Scanner;

public class ReverseaStrinig {
	public static void main(String[] args) {
		System.out.println("ENter a STring");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String res ="";
		for (int i = s.length()-1; i >= 0; i--) {
			 res += s.charAt(i);
		}
		System.out.println(res);
	}
}
