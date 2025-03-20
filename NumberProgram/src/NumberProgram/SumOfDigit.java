package NumberProgram;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		System.out.println("Enter A NUmber To Find The Sum Of Digit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		while(n>=0) {
			int rem = n%10;
			sum = sum+rem;
			n = n/10;
		}
		System.out.println("Sum Of The Digit Of A Given NUmber is : "+sum);
	}

}
