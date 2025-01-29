package Jan29;

import java.util.Scanner;

public class SumOfDigit {
public static void main(String[] args) {
	System.out.println("ENter a Number to calculate the sum of the Digit");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Sum of digit of a given Number is : "+sum(n));
}
static int sum(int n) {
	if(n==0)return 0;
	return n%10+sum(n/10);
}
}
