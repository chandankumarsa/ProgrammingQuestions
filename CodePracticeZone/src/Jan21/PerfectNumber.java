package Jan21;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("Enter a Number to check Perfect Number or Not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	int sum =isPerfect(n, 1, 0);
		if(n==sum) {
			System.out.println("is a Perfect Number ..");
		}else {
			System.out.println("is Not a perfect Number");
		}
	}
	static int isPerfect(int n,int i,int sum) {
		if(i>n/2) {
			return sum;
		}
		if(n%i==0) {
			sum = sum+i;
		}
		return isPerfect(n, i+1, sum);
	}

}
