package Feb6;

import java.util.Scanner;

public class BinaryToDecimal {
public static void main(String[] args) {
	System.out.println("ENter a Nuber to convert Binary to Decimal");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int place =1;
	int sum =0;
	while(n>0) {
		int rem = n%10;
		sum = sum+rem*place;
		n=n/10;
		place = place*2;
	}
	System.out.println("Binary to decimal Number is : "+sum);
	
}
}
