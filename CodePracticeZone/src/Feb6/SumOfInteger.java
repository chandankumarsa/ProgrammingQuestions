package Feb6;

import java.util.Scanner;

public class SumOfInteger {
public static void main(String[] args) {
	System.out.println("Enter a Number to calculate the sum of the Integer");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum =0;
	for(int i =1;i<=n;i++) {
		sum +=i;
	}
	System.out.println("sum of Integer of a Given number is : "+sum);
}
}
