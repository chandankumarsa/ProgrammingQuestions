package StringProgram;
import java.util.Scanner;
public class SecmaxOccuredCharacte {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	int max =0;
	int secmax =0;
	char maxchar ='\0',secmaxchar='\0';
	for(int i =0;i<s.length();i++) {
		int count =0;
		char ch =s.charAt(i);
		for(int j =0;j<s.length();j++) {
			if(s.charAt(j)==ch)count++;
		}
		if(count>max) {
			secmax=max;
			secmaxchar =maxchar;
			max =count;
			maxchar =ch;	
		}
		if(count>secmax && count!=max) {
			secmax=count;
			secmaxchar=ch;
		}
	}
	System.out.println(secmaxchar+": "+secmax);
	
	
}
}
