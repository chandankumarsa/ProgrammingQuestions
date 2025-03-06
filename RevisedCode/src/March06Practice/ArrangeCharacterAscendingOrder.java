package March06Practice;
import java.util.Scanner;
public class ArrangeCharacterAscendingOrder {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	char ch[]=s.toCharArray();
	for(int i =0;i<ch.length-1;i++) {
		for(int j =0;j<s.length()-1-i;j++) {
			if(ch[j]>ch[j+1]) {
				char temp =ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=temp;
			}
		}
	}
	System.out.println(ch);
}
}
