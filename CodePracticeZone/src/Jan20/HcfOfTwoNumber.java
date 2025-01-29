package Jan20;

import java.util.Scanner;

public class HcfOfTwoNumber {
public static void main(String[] args) {
	System.out.println("ENter Two Number two Perform The HCF Operations");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	System.out.println("Hcf Of TWo Number is : "+findhcf(a, b));
}
static int findhcf(int a, int b) {
	if(b==0) {
		return a;
	}
	return findhcf(b, a%b);
}
}
