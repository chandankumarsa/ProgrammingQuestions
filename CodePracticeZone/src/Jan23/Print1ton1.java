package Jan23;

import java.util.Scanner;

public class Print1ton1 {
public static void main(String[] args) {
	System.out.println("ENter a Number to print 1 to n");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	print(n);
}
static void print(int n) {
	if(n==0) {
		return;
	}
	
	print(n-1);
	System.out.println(n+" ");
}

}
