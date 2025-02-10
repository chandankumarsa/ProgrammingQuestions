package Feb4;

import java.util.Scanner;

public class MultiplicationOfInteger {
public static void main(String[] args) {
	System.out.println("ENter a Number to calculate Multiplication of an Integer");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int mul =1;
	String str =" ";
	for(int i =1;i<=n;i++) {
		str +=i;
		if(i<n) {
			str+="x";
		}
		mul *=i;
	}
	System.out.println("Multiplication of An Integer is : "+str+" = "+mul);
	
}
}
