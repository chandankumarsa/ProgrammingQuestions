package March06Practice;

import java.util.Scanner;

public class CountSecmaxOccuredCharacter {
public static void main(String[] args) {
	System.out.println("Enter a String : ");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int maxcount =0;
	int secmaxcount =0;
	char maxchar ='\0';
	char secMaxchar='\0';
	for(int i =0;i<s.length();i++) {
		int count =0;
		char ch=s.charAt(i);
		for(int j =0;j<s.length();j++) {
			if(s.charAt(j)==ch)count++;
		}
		if(count>maxcount) {
			secmaxcount=maxcount;
			secMaxchar=maxchar;
			maxcount=count;
			maxchar = ch;
			
		}
		else if(count >secmaxcount && count<maxcount) {
			secmaxcount= count;
			secMaxchar=ch;
		}
	}
	System.out.println(secMaxchar +" : "+secmaxcount);
}
}
