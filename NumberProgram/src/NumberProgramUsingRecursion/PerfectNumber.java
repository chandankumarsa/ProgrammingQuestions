package NumberProgramUsingRecursion;
import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	System.out.println("ENter a Number to check Perfec Number or not");
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
