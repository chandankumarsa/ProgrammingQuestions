package Feb4;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		System.out.println("Enter two number to Perform the lCm operations");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int big =(a>b?a:b);
		for(int lcm=big;lcm<=a*b;lcm++) {
			if(lcm%a==0 && lcm%b==0) {
				System.out.println(lcm);
				break;
			}
		}
		
	}
	

}
