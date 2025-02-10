package Feb4;

import java.util.Scanner;

public class PerfectNumber1 {
public static void main(String[] args) {
	System.out.println("ENter  a number to check if a Number is a perfect umber or not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum =0;
	for(int i =1;i<=n/2;i++)
	{
		if(n%i==0) {
			sum = sum+i;
		}
	}
	if(sum==n) {
		System.out.println("is a Perfect Number");
	}else {
		System.out.println("is not a Perfect Number");
	}
}
}
