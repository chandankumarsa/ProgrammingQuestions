package Feb_8Rec;
import java.util.Scanner;
public class SumofEvenOdd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
}
static int even(int n) {
	if(n==0)return 0;
	int rem = n%10;
	if(rem%2==0)return rem+even(n/10);
	return even(n/10);
}
static int odd(int n) {
	if(n==0)return 0;
	int  rem = n%10;
	if(rem%2!=0) {
		return rem+odd(n/10);
	}
	return odd(n/10);
	
}
}
