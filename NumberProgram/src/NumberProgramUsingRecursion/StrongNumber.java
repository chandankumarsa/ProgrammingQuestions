package NumberProgramUsingRecursion;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	System.out.println("ENter a Number to check the number is a Strong number or not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(isStrong(n, n, 0));
}
static int fact(int n) {
	if(n==0|| n==1)return 1;
	return n*fact(n-1);
}
static boolean isStrong(int n ,int m,int sum) {
	if(n==0)return sum==m;
	sum=sum+fact(n%10);
	return isStrong(n/10, m, sum);
	
}
}
