package Recurssion10;

import java.util.Scanner;

public class MultiplicationOfInteger {
public static void main(String[] args) {
	System.out.println("Enter a nUmber to calculat The MUltiplication of INteger");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
}
static int mul(int n) {
	if(n==0 || n==1) return 1;
	return n*mul(n-1);
}
}
