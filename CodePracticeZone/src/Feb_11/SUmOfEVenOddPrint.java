package Feb_11;

import java.util.Scanner;

public class SUmOfEVenOddPrint {
public static void main(String[] args) {
	System.out.println("Enter a NUmber to Print sum ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("SUm of Even nNumber of a Given number is : "+esum(n));
	System.out.println("Sum of Odd Number of a Given number is : "+osum(n));
}
static int esum(int n) {
	if(n==0)return 0;
	int rem = n%10;
	if(rem%2==0)return rem+esum(n/10);
	return esum(n/10);
}
static int osum(int n) {
	if(n==0)return 0;
	int rem = n%10;
	if(rem%2!=0)return rem +osum(n/10);
	return osum(n/10);
	
}
}
