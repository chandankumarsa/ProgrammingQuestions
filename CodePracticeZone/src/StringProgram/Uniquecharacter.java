package StringProgram;

import java.util.Scanner;

public class Uniquecharacter {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	char ch[]=s.toCharArray();
	for(int i =0;i<s.length();i++) {
		if(ch[i]=='\u0000')continue;
		boolean isUnique=true;
		for(int j =0;j<s.length();j++) {
			if(i!=j && ch[i]==ch[j]) {
				isUnique=false;
				break;
			}
		}
		if(isUnique) {
			System.out.println(ch[i]);
		}
	}
}

}
