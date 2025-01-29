package PracticeProgram18Jan;

import java.util.Scanner;

public class LcmOfTwoNumber {
	public static void main(String[] args) {
		System.out.println("ENter Two Number To Perform The Lcm Operation");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Lcm Of Given Two number Is : "+findLcm(a, b, (a>b)?a:b));
	}
	static int findLcm(int a, int b,int lcm) {
		if(lcm%a ==0 && lcm%b==0) {
			return lcm;
		}
		return findLcm(a, b, ++lcm);
	}

}
