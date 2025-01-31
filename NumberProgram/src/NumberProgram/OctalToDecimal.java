package NumberProgram;
import java.util.Scanner;

public class OctalToDecimal {
public static void main(String[] args) {
	System.out.println("ENter A number To Convert Octal To Decimal");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum =0;
	int place =1;
	while(n>0) {
		int rem = n%10;
		sum = sum+rem*place;
		n= n/10;
		place = place*8;
	}
	System.out.println(sum);
}
}
