package NumberProgram;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println("Enter the Number To check happy Number or Not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res =n;
		while(res!=1 && res!=4) {
			int sum =0;
			while(res>0) {
				int rem = res%10;
				sum = sum+rem*rem;
				res=res/10;
			}
			res=sum;
		}
		if(res==1) {
			System.out.println("Happy Number");
		}else {
			System.out.println("is not a Happy Number");
		}
	}

}