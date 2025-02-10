package Feb4;

import java.util.Scanner;

public class Hcf {
public static void main(String[] args) {
	System.out.println("Enter two nUmber to perform the hcf operations");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int hcf =0;
	for(int i =1;i<=a;i++) {
		if(a%i==0 && b%i==0) {
			hcf = i;
		}
	}
	System.out.println("Hcf of two number is : "+hcf);
}
}
