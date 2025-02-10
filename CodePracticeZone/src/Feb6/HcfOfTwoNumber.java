package Feb6;

import java.util.Scanner;

public class HcfOfTwoNumber {
public static void main(String[] args) {
	System.out.println("Enter two number to perform the hcf operations");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int hcf =0;
	for(int i =1;i<=a;i++) {
		if(a%i==0 && b%i==0) {
			hcf=i;
		}
	}
	System.out.println(hcf);
}
}
