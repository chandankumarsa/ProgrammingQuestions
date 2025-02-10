package Feb4;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Enter a Number to check if a Number is Prime or not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	boolean flag =true;
	if(n<=1) {
		flag = false;
		
	}
	else {
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				flag = false;
				break;
			}
		}
	}
	if(flag) {
		System.out.println("is a Prime nUmber");
	}else {
		System.out.println("is not a Prime number");
	}
}
}
