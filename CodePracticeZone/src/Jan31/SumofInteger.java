package Jan31;

import java.util.Scanner;

public class SumofInteger {
public static void main(String[] args) {
	System.out.println("ENter a Number to Perform the sum of Integer");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Sum of INteger of a Given Number is : "+sum(n));
}
static int sum(int n) {
	if(n==0)return 0;
	return n+sum(n-1);
}
}
