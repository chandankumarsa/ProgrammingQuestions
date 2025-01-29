package PracticeProgram18Jan;

import java.util.Scanner;

public class MultiplicationOfInteger {
public static void main(String[] args) {
	System.out.println("ENter a Number To Perform The Multiplication Of An Integer");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Multiplication Of a Given Number is : "+mul(n));
}
static int mul(int n) {
	if(n==1 || n==0) {
		return 1;
	}
	return n*mul(n-1);
}

}
