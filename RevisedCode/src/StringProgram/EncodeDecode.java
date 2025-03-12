package StringProgram;

import java.util.Scanner;

public class EncodeDecode {
public static void main(String[] args) {
	System.out.println("Enter a STring");
	Scanner sc = new Scanner(System.in);

	System.out.println(encode("chandan Kumar Sahu", 2));
	System.out.println(decode("ejcpfcp Mwoct Ucjw", 2));
}
static String encode(String s,int n) {
	char ch[]= s.toCharArray();
	for(int i =0;i<s.length();i++) {
		if(Character.isUpperCase(ch[i])) {
			ch[i]=((char)(((((ch[i]-'A'+n)%26)+26)%26)+'A'));
		}
		else if(Character.isLowerCase(ch[i])) {
			ch[i]=((char)(((((ch[i]-'a'+n)%26)+26)%26)+'a'));
		}
	}
	return new String(ch);
}
static String decode(String s,int n ) {
	return encode(s, -n);
}
}
