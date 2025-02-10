package Feb6;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Enter a Number to check if a Number is a Prime number or Not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	boolean flag = true;
	if(n<=1)System.out.println("is  not a prime number");
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)flag = false;
	}
	if(flag)System.out.println("is A Prime number");
	else System.out.println("is not a Prime number");
}

}
