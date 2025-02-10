package Feb6;

import java.util.Scanner;

public class SumofEvenOdd {
public static void main(String[] args) {
	System.out.println("ENter the Number to calculate sum of Even and odd Number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int esum=0;
	int osum=0;
	int sum=0;
	while(n>0) {
		int rem =n%10;
		if(n%2==0) {
			esum+=rem;
		}else {
			osum+=rem;
		}
		n /=10;
	}
	System.out.println("Sum of Even number is : "+esum);
	System.out.println("Sum of Odd NUmber is : "+osum);
}
}
