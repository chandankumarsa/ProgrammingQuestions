package Jan31;

import java.util.Scanner;

public class BinaryToDecimal {
public static void main(String[] args) {
	System.out.println("ENter a Number To cnvert Binary to Decimal Number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum =0;
	int place =1;
	while(n>0) {
		int rem = n%10;
		sum = sum+rem*place;
		n = n/10;
		place = place*2;
	}
	System.out.println(sum);
	
}
}
