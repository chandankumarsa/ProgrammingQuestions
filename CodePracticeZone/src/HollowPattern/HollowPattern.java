package HollowPattern;
import java.util.Scanner;
public class HollowPattern {
public static void main(String[] args) {
	System.out.println("Enter The range");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
//	ptn1(n);
//	plush(n);
	cross(n);
	hollowSquare(n);
}
static void ptn1(int n) {
	for(int i =1;i<=n;i++) {
		for(int j =1;j<=n;j++) {
			if(j==1 || j==n) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
static void plush(int n) {
	for(int i =1;i<=n;i++) {
		for(int j =1;j<=n;j++) {
			if(i==n/2+1||j==n/2+1) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
static void cross(int n) {
	for(int i =1;i<=n;i++) {
		for(int j =1;j<=n;j++) {
			if(i+j ==n+1) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
static void hollowSquare(int n) {
	for(int i =1;i<=n;i++) {
		for(int j =1;j<=n;j++) {
			if(i==1 || i==n||j==1 || j==n) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}