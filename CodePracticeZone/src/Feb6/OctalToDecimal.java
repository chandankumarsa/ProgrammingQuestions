package Feb6;

import java.util.Scanner;

public class OctalToDecimal {
public static void main(String[] args) {
	System.out.println("ENter a Number to convert Octal to decimal");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int place =1;
	int sum =0;
	while(n>0) {
		int rem = n%10;
		sum+=rem*place;
		n/=10;
		place = place *8;
	}
	System.out.println("Convert Octal to Decimal Number is : "+sum);
}
}
