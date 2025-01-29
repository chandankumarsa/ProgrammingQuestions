package Jan20;

import java.util.Scanner;

public class SumOfInteger {
public static void main(String[] args) {
	System.out.println("ENter a Number To Perform the SumOfInteger java");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Sum Of integer of a Given Number is : "+sum(n));
	
}
static int sum(int n) {
	if(n==0) {
		return 0;
	}
	return n+sum(n-1);
}
}
