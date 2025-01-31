package Jan27;
import java.util.Scanner;
public class SecoundHighestPrime {
public static void main(String[] args) {
	System.out.println("Enter the  start and End Range");
	Scanner sc = new Scanner(System.in);
	int st = sc.nextInt();
	int end = sc.nextInt();
	range(st, end, 0);
}
public static void range(int st,int end,int count) {
	if(st>end)return;
	if(isPrime(end, end/2)) {
		count++;
		if(count==2) {
			System.out.println(end);
			return;
		}
	}
	range(st, end-1, count);
}
public static boolean isPrime(int n,int i) {
	if(n<=1)return false;
	if(i==1)return true;
	if(n%i==0) {
		return false;
	}
	return isPrime(n, i-1);
	
}
}
