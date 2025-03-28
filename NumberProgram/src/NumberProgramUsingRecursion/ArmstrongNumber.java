package NumberProgramUsingRecursion;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter a Number to check if it is an Armstrong Number or Not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isArmstrong(n, count(n), 0, n)) { // Pass the original number as an additional parameter
			System.out.println("Is an Armstrong Number");
		} else {
			System.out.println("Is not an Armstrong Number");
		}
	}
	static int count(int n) {
		if (n == 0)
			return 0;
		return 1 + count(n / 10);
	}

	static boolean isArmstrong(int n, int m, int sum, int originalNumber) {
		if (n == 0)
			return sum == originalNumber; // Compare sum with the original number
		sum += (int) Math.pow(n % 10, m); // Casting result to int
		return isArmstrong(n / 10, m, sum, originalNumber);
	}
}