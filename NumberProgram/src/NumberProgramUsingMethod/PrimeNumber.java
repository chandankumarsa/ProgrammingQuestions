package NumberProgramUsingMethod;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("ENter a Number To check Prime Number or Not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(isPrime(n)) {
			System.out.println("is a prime Number");
		}else {
			System.out.println("is Not a prime Number");
		}
	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
