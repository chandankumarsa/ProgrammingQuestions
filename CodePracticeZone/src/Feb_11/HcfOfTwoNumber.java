package Feb_11;

import java.util.Scanner;

public class HcfOfTwoNumber {
public static void main(String[] args) {
	System.out.println("ENter two NUmber to perform the hcf Operations");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Hcf of two number is : "+hcf(a, b));
}
static int hcf(int a,int b) {
	if(b==0)return a;
	return hcf(b, a%b);
}
}
