package Jan26;

import java.util.Scanner;

public class HighestPerfectNumberInRange {
	public static void main(String[] args) {
		System.out.println("Enter a Number to Print Highest Prerfect Number in a Range");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start RAnge");
		int st = sc.nextInt();
		System.out.println("Enter the end RAnge");
		int end = sc.nextInt();
		perfect(st, end);
	}

	static void perfect(int st,int end) {
		if(st>end)return;
		if(isPerfect(end, end/2, 0)) {
			System.out.println(end);
			return;
		}
		perfect(st, end-1);
	}

	static boolean isPerfect(int n, int i, int sum) {
		if (i == 0)
			return sum == n;
		if (n % i == 0) {
			sum = sum + i;
		}
		return isPerfect(n, i - 1, sum);
	}

}
