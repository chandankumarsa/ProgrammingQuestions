package NumberProgramUsingMethod;

import java.util.Scanner;

public class HCFOfTWoNumber {
	public static void main(String[] args) {
		System.out.println("ENter Two Number To Find Hcf Operation");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		hcf(a,b);
	}
	static void hcf(int a,int b) {
		int hcf =0;
		for(int i=1;i<=a;i++) {
			if(a%i==0 && b%i==0) {
				hcf =i;
			}
		}
		System.out.println("HCF Of Two Number is "+hcf);
	}

}
