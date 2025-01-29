package Jan27;

import java.util.Scanner;

public class StringNumber2 {
public static void main(String[] args) {
	System.out.println("ENter a Number to check Strong number or not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(strong(n, n, 0));
}
static boolean strong(int n,int m,int sum) {
	if(n==0)return m == sum;
	sum+=fact(n%10);
	return strong(n/10, m, sum);
}
static int fact(int n) {
	if(n==0 ||n==1)return 1;
	return n*fact(n-1);
}
}
