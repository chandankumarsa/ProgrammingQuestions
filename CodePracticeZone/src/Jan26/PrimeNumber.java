package Jan26;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a NUmber to check Prime NUmber or not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(isPrime(n, n/2)) {
			System.out.println("is a Prime NUmber");
		}else {
			System.out.println("is not a Prime Number");
		}
		
	}
	static boolean isPrime(int n,int i) {
		if(n<=1)return false;
		if(i==1)return true;
		if(n%i==0) {
			return false;
		}
		return isPrime(n,i-1);
	}

}
