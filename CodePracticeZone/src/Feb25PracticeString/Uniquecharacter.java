package Feb25PracticeString;
import java.util.Scanner;
public class Uniquecharacter {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		boolean unique =true;
		if(s.charAt(i)==' ')continue;
		for(int j =0;j<s.length();j++) {
			while(i!=j && s.charAt(j)==ch) {
				unique=false;
				break;
			}
		}
		if(unique)System.out.println(ch);
	}
}

}





