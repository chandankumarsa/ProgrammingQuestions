package Feb_8Rec;

import java.util.Scanner;

public class MultiplicationOfInteger {
public static void main(String[] args) {
	System.out.println("ENter a NUmber to calculate the Multiplication of Integer ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Multiplications of an integer is : "+mul(n));
}
static int mul(int n) {
	if(n==0 || n==1) {
		return 1;
	}
	return n*mul(n-1);
}
}
