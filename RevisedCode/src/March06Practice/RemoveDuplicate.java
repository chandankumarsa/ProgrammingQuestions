package March06Practice;

import java.util.Scanner;

public class RemoveDuplicate {
public static void main(String[] args) {
	System.out.println("Enter a String : ");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	char ch[] = s.toCharArray();
	for(int i =0;i<s.length();i++) {
		int count =1;
		if(ch[i]=='\u0000')continue;
		for(int j =i+1;j<s.length();j++) {
			if(ch[i]==ch[j]) {
				count++;
				ch[j]='\u0000';
			}
		}
		System.out.println(ch[i]+" :"+count);
	}
}
}
