package PracticeProgram18Jan;

import java.util.Scanner;

public class Lcm1 {
	public static void main(String[] args) {
		System.out.println("ENter Two Number To Perform Lcm Operations");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Lcm Of Two Number is : "+findLcm(a, b, (a>b)?a:b));
	}
	static int findLcm(int a, int b,int lcm) {
		if(lcm%a==0 && lcm%b==0) {
			return lcm;
		}
		return findLcm(a, b, ++lcm);
	}

}
