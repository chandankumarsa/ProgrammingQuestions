package Feb4;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	System.out.println("ENter a NUmber to check if a Number is a Perfect Number or Not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a=n;
	int sum =0;
	while(a>0) {
		int fact =1;
		int rem = a%10;
		for(int i=1;i<=rem;i++) {
			fact = fact*i;
		}
		sum = sum+fact;
		a=a/10;
		
	}
	if(sum ==n) {
		System.out.println("is a Strong nUmber");
	}else {
		System.out.println("is Not a Strong NUmber");
	}
	
}
}
