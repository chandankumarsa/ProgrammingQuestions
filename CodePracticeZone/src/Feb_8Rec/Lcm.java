package Feb_8Rec;

import java.util.Scanner;

public class Lcm {
public static void main(String[] args) {
	System.out.println("ENter two Number to Perform the lcm Operations");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Lcm of a Given number is : "+ lcm(a, b, ((a>b)?a:b)));
}
static int lcm(int a,int b,int lcm) {
	if(lcm%a==0 && lcm%b==0) {
		return lcm;
	}
	return lcm(a,b,lcm+1);
}
}
