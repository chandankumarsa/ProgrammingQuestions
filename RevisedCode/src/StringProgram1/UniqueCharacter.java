package StringProgram1;
import java.util.Scanner;
public class UniqueCharacter {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		boolean isunique = true;
		for(int j =0;j<s.length();j++) {
			if(i!=j && s.charAt(j)==ch)isunique=false;
		}
		if(isunique) {
			System.out.println(ch);
		}
	}
}
}
