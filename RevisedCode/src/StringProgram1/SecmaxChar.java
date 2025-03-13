package StringProgram1;

import java.util.Scanner;

public class SecmaxChar {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int maxcount =0;
	int secmaxcount=0;
	char maxchar ='\0',secmaxchar='\0';
	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		int count =0;
		for(int j =0;j<s.length();j++) {
			if(s.charAt(j)==ch)count++;
		}
		if(count>maxcount) {
			secmaxcount=maxcount;
			secmaxchar=maxchar;
			maxcount =count;
			maxchar = ch;
		}else if(count>secmaxcount && count!=maxcount) {
			secmaxcount= count;
			secmaxchar=ch;
		}
	}
	System.out.println(secmaxchar+": "+secmaxcount);
}
}
