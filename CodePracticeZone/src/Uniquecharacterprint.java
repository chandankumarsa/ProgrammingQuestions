import java.util.Scanner;

public class Uniquecharacterprint {
public static void main(String[] args) {
	System.out.println("Enter a String to print unique character");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	for(int i =0;i<s.length();i++) {
		boolean isUnique=true;
		char ch =s.charAt(i);
		for(int j =0;j<s.length();j++) {
			if(i!=j&&s.charAt(j)==ch) {
				isUnique=false;
				break;
			}
		}
		if(isUnique)System.out.print(ch);
	}
}
}
