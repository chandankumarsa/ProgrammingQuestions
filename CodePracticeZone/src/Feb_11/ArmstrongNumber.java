package Feb_11;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	System.out.println("Enter a number to check armstrong number or not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(isArmstrong(n, count(n), 0, n));
}
static int count(int n) {
	if(n==0)return 0;
	return 1+count(n/10);
}
static boolean isArmstrong(int n,int m,int sum,int original) {
	if(n==0)return sum ==original;
	sum+=(int)Math.pow(n%10,m);
	return isArmstrong(n/10, m, sum, original);
}
}
