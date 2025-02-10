package Jan27;

import java.util.Scanner;

public class StrongNumber1 {
public static void main(String[] args) {
	System.out.println("ENter a Number to check Strong number or not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(isStrong(n, n, 0));
}
static int fac(int n) {
	if(n==0|| n==1)return 1;
	return n*fac(n-1);
}
static boolean isStrong(int n,int m,int sum) {
	if(n==0)return sum==m;
	sum+=fac(n%10);
	return isStrong(n/10, m, sum);
}
}
