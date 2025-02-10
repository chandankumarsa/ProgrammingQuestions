package Feb_8Rec;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter  Number to find factoril ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial of a Given nUmber : "+fact(n));
	}
	static int fact(int n) {
		if(n==0 ||  n==1)
		return 1;
		return n* fact(n-1);
		
	}
}
