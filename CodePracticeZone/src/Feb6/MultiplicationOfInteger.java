package Feb6;

import java.util.Scanner;

public class MultiplicationOfInteger {
public static void main(String[] args) {
	System.out.println("ENter a Number to calculate the Multiplications of an integer");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int mul =1;
	for(int i =1;i<=n;i++) {
		mul*=i;
	}
	System.out.println("Multiplication of an integer is : "+mul);
}
}
