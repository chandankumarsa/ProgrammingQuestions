import java.util.Scanner;

public class RemovingDuplicate {
public static void main(String[] args) {
	System.out.println("ENter a String to Removing the Duplicate Character");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	char ch[]=s.toCharArray();
	String res ="";
	for(int i =0;i<ch.length;i++) {
		if(ch[i]=='\u0000')continue;
		for(int j =i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				ch[j]='\u0000';
			}
		}
		res+=ch[i];
	}
	System.out.println(ch);
}
}
