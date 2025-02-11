package Feb_11;

import java.util.Scanner;

public class MultiplicationOfInteger {
public static void main(String[] args) {
	System.out.println("Enter a NUmber to calculat The Multiplication of integer");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Multiplication of a given number is : "+mul(n));
}
static int mul(int n) {
	if(n==0 || n==1)return 1;
	return n*mul(n-1);
}
}
