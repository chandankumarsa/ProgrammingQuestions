package Jan20;

import java.util.Scanner;

public class LcmOfTwoNumber {
public static void main(String[] args) {
	System.out.println("ENter Two Number two Perform The LCM Operations");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int ans=findLcm(a,b,(a>b?a:b));
	System.out.println("Lcm Of TWo Number is : "+ans);
}
static int findLcm(int a,int b,int lcm) {
	if(lcm%a==0 && lcm%b==0) {
		return lcm;
	}
	return findLcm(a, b, lcm+1);
}
}
