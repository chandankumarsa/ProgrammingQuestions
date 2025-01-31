package NumberProgram;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println("Enter A number To Convert Decimal to Binary");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		int place =1;
		while(n>0){
			int rem = n%2;
			sum = sum+rem*place;
			n = n/2;
			place = place*10;
		}
		System.out.println(sum);
	}

}