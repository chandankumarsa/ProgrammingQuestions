package Jan29;

import java.util.Scanner;

public class PerfectNumberOrNot {
public static void main(String[] args) {
	System.out.println("ENter a Number to check if a Number is a Perfect Number or nOt");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(isPerfect(n, n/2, 0));
}
static boolean isPerfect(int n,int i,int sum) {
	if(i==0)return sum==n;
	if(n%i==0) {
		sum+=i;
	}
	return isPerfect(n, i-1, sum);
}

}
