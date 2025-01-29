package Jan25;

import java.util.Scanner;

public class HcfOfTwoNUmber {
	public static void main(String[] args) {
		System.out.println("ENter two number to perform hcf operations");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Hcf Of Two NUmber is : "+findHcf(a, b));
	}
	static int findHcf(int a,int b) {
		if(b==0) {
			return a;
		}
		return findHcf(b, a%b);
	}
}
