package Feb6;

import java.util.Scanner;

public class HappyNumber {
public static void main(String[] args) {
	System.out.println("ENter a Number to check if a Number is a happy Number or not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int res =n;
	while(res!=1 && res!=4) {
		int sum =0;
		while(res>0) {
			int rem = res%10;
			sum+=rem*rem;
			res/=10;
		}
		res=sum;
	}
	if(res==1) {
		System.out.println("is a Happy Number");
	}else {
		System.out.println("is not a Happy Number");
	}
}
}
