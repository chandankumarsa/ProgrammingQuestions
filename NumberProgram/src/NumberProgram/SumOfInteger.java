package NumberProgram;

import java.util.Scanner;

public class SumOfInteger {
	public static void main(String[] args) {
		System.out.println("Enter a Number to CALCULATE THE SUM OF INTEGER ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		String str = " ";
		for(int i =1;i<=n;i++) {
			sum = sum+i;
			str = str+i;
			if(i<n) {
				str =str+"+";
			}
		}
		
		System.out.println("Sum Of Integer Of a Given Number : "+ str +"="+sum);
	}

}


//CALCULATE THE SUM OF INTEGER (1 to N)