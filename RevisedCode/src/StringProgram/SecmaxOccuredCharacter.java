package StringProgram;

import java.util.Scanner;

public class SecmaxOccuredCharacter {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	String res ="";
	int maxcount=0, secmax=0;
	char maxchar ='\0',secmaxchar='\0';
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		int count =0;
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)==ch)count++;
		}
		if(count>maxcount) {
			secmax=maxcount;
			secmaxchar=maxchar;
			maxcount=count;
			maxchar=ch;
			
		}if(count>secmax && count<maxcount) {
			secmax=count;
			secmaxchar=ch;
		}
	}
	System.out.println(secmaxchar+" : "+secmax);
}
}
