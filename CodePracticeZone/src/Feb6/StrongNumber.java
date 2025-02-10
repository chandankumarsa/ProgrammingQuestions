package Feb6;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	System.out.println("ENter a Number to check if a Number is a Strong Number or not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a =n;
	int sum =0;
	while(a>0) {
		int fact =1;
		int rem = a%10;
		for(int i =1;i<=rem;i++) {
			fact=fact*i;
		}
		sum+=fact;
		a/=10;
	}
	if(sum==n) {
		System.out.println(n+" :is a Strong Number");
	}else {
		System.out.println(n+" :is not a Strong Number");
	}
}
}
