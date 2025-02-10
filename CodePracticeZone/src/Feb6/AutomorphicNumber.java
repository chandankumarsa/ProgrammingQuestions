package Feb6;

import java.util.Scanner;

public class AutomorphicNumber {
public static void main(String[] args) {
	System.out.println("Enter a Number to check if a NUmber is a Automorphic number or not");
	Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int num=n;
	int sq =n*n;
	boolean flag =true;
	while(n>0) {
		if(n%10!=sq%10) {
			flag = false;
			break;
		}
		n/=10;
		sq/=10;
	}
	if(flag) {
		System.out.println(num+" : is an Automorphic number");
	}else {
		System.out.println(num+" : is not an Automorphic number");
	}
}
}
