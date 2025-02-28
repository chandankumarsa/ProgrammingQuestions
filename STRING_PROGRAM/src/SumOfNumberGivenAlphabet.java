import java.util.Scanner;
public class SumOfNumberGivenAlphabet {
public static void main(String[] args) {
	System.out.println("ENter a String to Calculate the sum of the Alpha Numeric");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int sum =0;
	for(int i =0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(ch>='0'&& ch<='9')sum+=ch-'0';
	}
	System.out.println("Sum of the Alpha Numeric of a Given NUmber is : "+sum);
}
}
