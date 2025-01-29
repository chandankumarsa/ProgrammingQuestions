package Jan21;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		System.out.println("Enter Two Number To Find Hcf Operations");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("lcm Of Two Number is : "+findLcm(a, b, (a>b?a:b)));
	}
	static int findLcm(int a,int b,int lcm) {
		if(lcm%a==0 && lcm%b==0) {
			return lcm;
		}
		return findLcm(a, b, ++lcm);
	}

}
