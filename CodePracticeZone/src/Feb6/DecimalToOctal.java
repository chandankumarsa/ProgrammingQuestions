package Feb6;

import java.util.Scanner;

public class DecimalToOctal {
public static void main(String[] args) {
	System.out.println("ENter a Number to convert decimal To Octal");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum =0;
	int place =1;
	while(n>0) {
		int rem = n%8;
		sum=sum+rem*place;
		n/=8;
		place = place*10;
	}
	System.out.println("Convert Decimal to Octal is : "+sum);
}
}
