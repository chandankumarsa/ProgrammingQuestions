package NumberProgram;

import java.util.Scanner;

public class MultiplicationofInteger {
public static void main(String[] args) {
	System.out.println("ENter a Number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int mul =1;
	String str ="";
	for(int i =0;i<n;i++) {
		mul*=i;
		str+=i;
		if(i<n) {
			str+=i;
		}
	}
}
}
