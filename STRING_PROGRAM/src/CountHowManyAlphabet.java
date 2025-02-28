import java.util.Scanner;
public class CountHowManyAlphabet {
public static void main(String[] args) {
	System.out.println("ENter a String ");
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int count =0;
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		if((ch>='A' && ch<='Z')||(ch>='a'&& ch<='z'))count++;
	}
	System.out.println(count);	
}
}
