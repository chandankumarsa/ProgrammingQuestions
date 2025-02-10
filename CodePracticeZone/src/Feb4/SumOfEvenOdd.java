package Feb4;

import java.util.Scanner;

public class SumOfEvenOdd {
public static void main(String[] args) {
	System.out.println("Enter a Number to find the sum of the even and odd print seperaately");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int esum =0;
	int osum =0;
	
	while(n>0) {
		int rem = n%10;
		if(n%2==0) {
			esum+=rem;
		}
		else {
			osum+=rem;
		}
		n=n/10;
	}
	System.out.println("sum of EVen Number  is : "+esum);
	System.out.println("sum of Odd Number  is : "+osum);
}
}
