package Feb_8Rec;

import java.util.Scanner;

public class SumOfInteger {
public static void main(String[] args) {
	System.out.println("Enter a Number to calculate the sum of the iinteger");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Sum of Integr of a NUmber is : "+sum(n));
}
static int sum(int n) {
	if(n==0)return 0;
	return n+sum(n-1);
}
}
