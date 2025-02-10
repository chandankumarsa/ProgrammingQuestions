package Feb4;

import java.util.Scanner;

public class HappyNumber1 {
public static void main(String[] args) {
	System.out.println("ENter a NUmber to check Happy Number or not");
	Scanner sc = new Scanner(System.in);
	int  n= sc.nextInt();
	int res =n;
	while(res!=1 && res!=4) {
		int sum =0;
		while(res>0) {
			int rem = res%10;
			sum = sum+rem*rem;
			res/=10;
		}
		res = sum;
	}
	if(res ==1) {
		System.out.println("is a Happy Number");
	}else {
		System.out.println("is Not a Happy NUmber");
	}
}
}
