package Feb_11;

import java.util.Scanner;

public class NthFibNumber {
public static void main(String[] args) {
	System.out.println("ENter a Number to find the nth Fib NUmber");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Nth fib Number is : "+fib(n));
}
static int fib(int n) {
	if(n==0)return 0;
	if(n==1)return 1;
	return fib(n-1)+fib(n-2);
}
}
