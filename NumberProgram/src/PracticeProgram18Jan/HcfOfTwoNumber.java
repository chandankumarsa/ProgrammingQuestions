package PracticeProgram18Jan;

import java.util.Scanner;

public class HcfOfTwoNumber {
public static void main(String[] args) {
	System.out.println("ENter Two Number To Perform Hcf Operation");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Hcf Of Two Number is : "+findhcf(a, b));
	
}
static int findhcf(int a,int b) {
	if(b==0) {
		return a;
	}
	return findhcf(b,a%b);
	
}
}
