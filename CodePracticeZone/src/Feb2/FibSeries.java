package Feb2;

import java.util.Scanner;

public class FibSeries {
public static void main(String[] args) {
	System.out.println("ENter a Number to print in a Fib Series");
	Scanner sc = new Scanner(System.in);
	int end = sc.nextInt();
	int n = sc.nextInt();
	fib(0, 1, 1, n);
}
static void fib(int a,int b,int c,int n) {
	if(c>n)return ;
	System.out.print(a+" ");
	fib(b, a+b, c+1, n);
}
}
