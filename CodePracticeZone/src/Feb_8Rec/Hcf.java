package Feb_8Rec;

import java.util.Scanner;

public class Hcf {
public static void main(String[] args) {
	System.out.println("Enter a NUmber to Perform the hcf operations");
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	int b =sc.nextInt();
	System.out.println("Hcf of two number is : "+hcf(a, b));
}
static int hcf(int a,int b) {
	if(b==0)return a;
	return hcf(b, a%b);
}
}
