package Recurssion10;

import java.util.Scanner;

public class SumOfEvenOddPrint {
public static void main(String[] args) {
	System.out.println("Enter a NUmber to print sum of eve n and odd Print separately");
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("SUm of EVen number is : "+esum(n));
	System.out.println("SUm of Odd Number is : "+osum(n));
}
static int esum(int n) {
	if(n==0)return 0;
	int rem = n%10;
	if(n%2==0) {
		return rem+esum(n/10);
	}
	return esum(n/10);
}
static int osum(int n ) {
	if(n==0)return 0;
	int rem = n%10;
	if(rem%2!=0) {
		return rem+osum(n/10);
	}
	return osum(n/10);
	
}
}
