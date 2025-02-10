package Feb6;

import java.util.Scanner;

public class DecimalToBinary {
public static void main(String[] args) {
	System.out.println("ENter a Number to convert Decimal to binary");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int place =1;
	int sum=0;
	while(n>0){
		int rem = n%2;
		sum+=rem*place;
		n/=2;
		place =place*10;
	}
	System.out.println("To convert Decimal to binary number is : "+sum);
}
}
