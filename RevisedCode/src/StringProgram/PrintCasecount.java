package StringProgram;

import java.util.Scanner;

public class PrintCasecount {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String uc ="",lc="",sp ="",nc="";
	String res =" ";
	for(int i =0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(ch>='a'&& ch<='z')lc+=ch;
		else if(ch>='A'&& ch<='Z')uc+=ch;
		else if(ch>='0'&& ch<='9')nc+=ch;
		else sp+=ch;	
	}
	res+=uc+lc+nc+sp;
 
	System.out.println(res);
}

}
