package Jan29;

import java.util.Scanner;

public class Hcf {
	public static void main(String[] args) {
		System.out.println("ENter Two Number to Perform the hCf operations");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Hcf of two number is : "+findHcf(a, b));
	}
	static int findHcf(int a,int b) {
		if(b==0)return a;
		return findHcf(b, a%b);
	}

}
