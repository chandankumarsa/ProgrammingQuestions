package NumberProgramUsingMethod;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	System.out.println("Enter a Number To Check Perfect Number OR not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	isPerfect(n);
}
static void isPerfect(int n) {
	int sum =0;
	for(int i =1;i<=n/2;i++) {
		if(n%i==0) {
			sum = sum+i;
		}
	}
	if(sum==n) {
		System.out.println("is a Perfect number");
	}else {
		System.out.println("is Not a Perfect Number");
	}

}
}
