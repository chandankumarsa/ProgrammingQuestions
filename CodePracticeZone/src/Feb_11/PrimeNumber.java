package Feb_11;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Enter a NUmber to check if a NUmber is a Prime number or not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(isPrime(n, n/2));
}
static boolean isPrime(int n,int i) {
	if(n<=1)return false;
	if(i==1)return true;
	if(n%i==0) {
		return false;
	}
	return isPrime(n, i-1);
}
}
