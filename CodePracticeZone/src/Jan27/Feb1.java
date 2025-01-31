package Jan27;

import java.util.Scanner;

public class Feb1 {
public static void main(String[] args) {
	System.out.println("ENter the start range and end range");
	Scanner sc = new Scanner(System.in);
	int st = sc.nextInt();
	int end = sc.nextInt();
	range(st, end);
}
static void range(int st,int end) {
	if(st>end)return;
	if(isPrime(st,st/2)) {
		System.out.print(st+" ");
	}
	range(st+1, end);
}
static boolean isPrime(int n,int i) {
	if(n<=1)return false;
	if(i==1)return true;
	if(n%i==0) {
		return false;
	}
	return isPrime(n, i-1);
}
}
