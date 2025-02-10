package Feb6;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	System.out.println("ENter a Number to check if a Number is a Armstrong Number or not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a=n;
	int sum=0;
	int count =0;
	while(a>0) {
		count++;
		a/=10;
	}
	int b =n;
	while(b>0) {
		int mul =1;
		int rem = b%10;
		for(int i =1;i<=count;i++) {
			mul =mul*rem;
		}
		sum+=mul;
		b/=10;
	}
	if(sum==n) {
		System.out.println(n+" :is a Armstrong Number");
	}else {
		System.out.println(n+" :is not a Armstrong Number");
	}
}
}
