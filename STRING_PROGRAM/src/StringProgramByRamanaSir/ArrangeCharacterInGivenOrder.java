package StringProgramByRamanaSir;
import java.util.Scanner;
public class ArrangeCharacterInGivenOrder {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String uc="",lc="",nc="",sp="",res="";
	for(int i=0;i<s.length();i++) {
		char ch =s.charAt(i);
		if(ch>='0'&& ch<='9')nc+=ch;
		else if(ch>='A'&& ch<='Z')uc+=ch;
		else if(ch>='a'&& ch<='z')lc+=ch;
		else sp+=ch;
	}
	res+=nc+sp+lc;
	System.out.println(res);
}
}
