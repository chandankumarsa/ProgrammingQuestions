package Jan25;

import java.util.Scanner;

public class fibone {
	public static void main(String[] args) {
		System.out.println("ENter the range");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));
	}
	static int fib(int n) {
		if(n==1)return 0;
		if(n==2)return 1;
		return fib(n-1)+fib(n-2);
	}

}
