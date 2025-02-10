package Feb4;

import java.util.Scanner;

public class SumOfInteger {
public static void main(String[] args) {
	System.out.println("Enter a Number to calculate the sum of the digit");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum =0;
	for(int i =1;i<=n;i++) {
		sum= sum+i;
	}
	System.out.println("Sum of Integer is : "+sum);
}

}
