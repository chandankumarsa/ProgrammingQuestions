package NumberProgram;

import java.util.Scanner;

public class MultiplicationOfInteger {
	public static void main(String[] args) {
		System.out.println("ENter a Number To calculate the sMultiplication Of Integer");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul =1;
		String str = " ";
		
		for(int i =1;i<=n;i++) {
			mul = mul*i;
			str = str+i;
			if(i<n) {
				str = str+" x ";
			}
		}
		System.out.println("Multiplication of a Given integer is : "+str +" = "+mul);
	}

}
