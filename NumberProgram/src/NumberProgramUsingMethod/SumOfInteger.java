package NumberProgramUsingMethod;

import java.util.Scanner;

public class SumOfInteger {
	public static void main(String[] args) {
		System.out.println("Enter a Number to CALCULATE THE SUM OF INTEGER ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans =sumOfInteger(n);
		System.out.println(ans);
	}
	static int sumOfInteger(int n) {
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum = sum+i;
		}
		return sum;
	}

}



//CALCULATE THE SUM OF INTEGER (1 to N)