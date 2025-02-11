package Feb_11;

import java.util.Scanner;

public class SumOfDIgitShouldSingleDIgit {
public static void main(String[] args) {
	System.out.println("ENter a NUmber to calculate the sum of Digit Should be in single DIgit");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("SUm of DIgit of a Given NUmber is : "+digit(n));
}
static int digit(int n) {
	if(n>=0 && n<=9)return n;
	return digit(sum(n));
}
static int sum(int n) {
	if(n==0)return 0;
	return n%10 +sum(n/10);
	
}
}
