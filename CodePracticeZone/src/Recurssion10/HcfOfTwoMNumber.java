package Recurssion10;

import java.util.Scanner;

public class HcfOfTwoMNumber {
public static void main(String[] args) {
	System.out.println("Enter two number to calculate the HCF of integer");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("hcf of two number is : "+ hcf(a, b));
}
static int hcf(int a,int b ) {
	if(b==0)return a;
	return hcf(b,a%b);
}
}