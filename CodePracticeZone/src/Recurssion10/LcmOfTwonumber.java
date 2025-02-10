package Recurssion10;

import java.util.Scanner;

public class LcmOfTwonumber {
public static void main(String[] args) {
	System.out.println("ENter two number to perform the Lcm Operations");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b =sc.nextInt();
	System.out.println("Lcm of Two Number : "+lcm(a, b, (a>b?a:b)));
}
static int lcm(int a,int b,int lcm) {
	if(lcm%a ==0 && lcm%b==0) {
		return lcm;
	}
	return lcm(a, b, lcm+1);
}
}
