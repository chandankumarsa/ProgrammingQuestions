package Feb24StringProgram;

import java.util.Scanner;

public class SecmaxOccuredCharacter {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	char maxchar='\0',secMaxchar='\0';
	int maxcount=0,secmaxcount =0;
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		int count =0;
		for(int j =0;j<s.length();j++) {
			if(s.charAt(j)==ch) {
				count ++;
			}
		}
		if(count>maxcount) {
			maxcount=secmaxcount;
			maxchar=secMaxchar;
			maxcount=count;
			maxchar=ch;
		}
		else if(count>secmaxcount && ch!=maxchar) {
			secmaxcount=count;
			secMaxchar=ch;
		}
	}
	System.out.println(secMaxchar +" : "+secmaxcount);
}
}
