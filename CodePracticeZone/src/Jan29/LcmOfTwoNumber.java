package Jan29;

import java.util.Scanner;

public class LcmOfTwoNumber {
	public static void main(String[] args) {
		System.out.println("ENter two number to find Lcm Operations");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Lcm of two Number is : "+lcm(a, b, (a>b?a:b)));
	}
	static int lcm(int a,int b,int lcm) {
		if(lcm%a==0 && lcm%b==0) {
			return lcm;
		}
		return lcm(a, b, lcm+1);
	}

}
