package StarPattern;
//10:48
import java.util.Scanner;
public class Pattern {
public static void main(String[] args) {
	System.out.println("ENter a Number");
	Scanner sc =  new Scanner(System.in);
	int n = sc.nextInt();
	hillPattern(n);
}
static void reversehill(int n) {//problem getting in this code
	for(int i=1;i<=n;i++) {
		for(int j =1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int j =i;j<=n;j++) {
			System.out.print("*");
		}
		for(int j =i;j<=n;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
static void hillPattern(int n) {
	for(int i=1;i<=n;i++) {
		for(int j =i;j<=n;j++) {
			System.out.print(" ");
		}
		for(int j =1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j =1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
static void leftTriangle(int n) {
	for(int i =1;i<=n;i++) {
		for(int j =1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int j =i;j<=n;j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}
static void RightTriangle(int n) {
	for(int i =1;i<=n;i++) {
		for(int j =i;j<=n;j++) {
			System.out.print(" ");
		}
		for(int j =1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}
static void descreasing(int n) {
	for(int i=1;i<=n;i++) {
		for(int j =i;j<=n;j++) {
			System.out.print("*"+"\t");
		}
		System.out.println();
	}
}
static void ptn1(int n) {
	for(int i =1;i<=n;i++) {
		for(int j =1;j<=n;j++) {
			System.out.print("*"+"\t");
		}
		System.out.println();
	}
}
static void increasing(int n) {
	for(int i =1;i<=n;i++) {
		for(int j =1;j<=i;j++) {
			System.out.print("*"+"\t");
		}
		System.out.println();
	}
}
}
