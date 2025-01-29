package Jan20;

import java.util.Scanner;

public class MultiplicationoFInteger {
public static void main(String[] args) {
	System.out.println("ENter a Number To Perform the MulOfInteger java");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Sum Of integer of a Given Number is : "+mul(n));
}
static int mul(int n) {
	if(n==0 || n==1) {
		return 1;
	}
	return n*mul(n-1);
	
}
}
