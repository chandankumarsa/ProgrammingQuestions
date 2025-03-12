package StringProgram;
import java.util.Scanner;
public class SecmaxoccuredCharacter {
public static void main(String[] args) {
	System.out.println("Enter a STring");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int maxcount=0;
	int secmaxcount=0;
	char maxchar = '\u0000';
	char secmaxchar = '\u0000';
	for(int i =0;i<s.length();i++) {
		char ch = s.charAt(i);
		int count =0;
		for(int j =0;j<s.length();j++) {
			if(s.charAt(j)==ch)count++;
		}
		if(count>maxcount) {
			secmaxchar=maxchar;
			secmaxcount= maxcount;
			maxcount = count;
			maxchar = ch;
		}
		else if(count>secmaxcount && count!=maxcount) {
			secmaxcount = count;
			secmaxchar = ch;
		}
	}
	System.out.println(secmaxchar+": "+secmaxcount);
}
}
