package NumberProgramUsingMethod;
import java.util.Scanner;
public class SumOfDigitShouldSingleDigit {
public static void main(String[] args) {
	System.out.println("Enter a Number To Find The Sum Of Digit should Be single Digit");
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	System.out.println("Sum Of Digit should Be single Digit of a Given Number is : "+sum(n));
}
static int  sum(int n) {
	int sum =0;
	while(n>0) {
		int rem = n%10;
		sum = sum+rem;
		n = n/10;
		if(n==0 && sum>9) {
			n= sum;
			sum =0;
		}
	}
	return sum;
	
}
}
