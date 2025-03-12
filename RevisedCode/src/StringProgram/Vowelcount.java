package StringProgram;
import java.util.Scanner;
public class Vowelcount {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int count =0;
	for(int i =0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')count++;
	}
	System.out.println("COunt Vowel is : "+count);
}
}
