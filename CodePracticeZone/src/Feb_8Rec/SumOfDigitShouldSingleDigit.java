package Feb_8Rec;
import java.util.Scanner;
public class SumOfDigitShouldSingleDigit {
public static void main(String[] args) {
	System.out.println("ENter a Number to calculate the sum of the Digit should be in single Digit");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("sum of Digit should be in single DIgit is : "+single(n));
}
static int single(int n) {
	if(n>=0 && n<=9) {
		return n;
	}
	return single(sum(n));
}
static int sum(int n) {
	if(n==0)return 0;
	return n%10+sum(n/10);
	
}
}
