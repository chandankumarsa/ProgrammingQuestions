package NumberProgramUsingMethod;

import java.util.Scanner;

public class MultiplicationOfinteger {
public static void main(String[] args) {
	System.out.println("Enter a Number To calculate Multiplication Of Integer");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int ans = mulOfInteger(n);
	System.out.println("Multiplication Of an Integer is : "+ans);
	
	
}
static int mulOfInteger(int n ) {
	int mul = 1;
	for(int i =1;i<=n;i++) {
		mul = mul*i;
	}
	return mul;
	
}
}
