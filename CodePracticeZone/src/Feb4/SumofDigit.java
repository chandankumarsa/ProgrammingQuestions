package Feb4;

import java.util.Scanner;

public class SumofDigit {
public static void main(String[] args) {
	System.out.println("ENter a Number to calculate the sum of the Digit");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum =0;
	while(n>0) {
		int rem = n%10;
		sum = sum+rem;
		n = n/10;
	}
	System.out.println("Sum of The digit of a Number is : "+sum);
}
}
