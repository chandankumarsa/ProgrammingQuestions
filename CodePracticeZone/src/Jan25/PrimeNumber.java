package Jan25;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("ENter a Number to check Prime Number or not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(isprime(n, n/2)) {
			System.out.println("is a Prime NUmber");
		}else {
			System.out.println("is not a prime number");
		}
	}
	static boolean isprime(int n,int i) {
		if(n<=1)return false;
		if(i==1)return true;
		if(n%i==0) {
			return false;
		}
		return isprime(n, i-1);
	}

}
