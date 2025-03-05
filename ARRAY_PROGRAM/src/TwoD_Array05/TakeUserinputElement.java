package TwoD_Array05;

import java.util.Arrays;
import java.util.Scanner;

public class TakeUserinputElement {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("ENter The row Size");
	int row =sc.nextInt();
	System.out.println("Enter the column size");
	int col = sc.nextInt();
	int a[][]=new int [row][col];
	System.out.println("Enter the element");
	for(int i =0;i<a.length;i++) {
		for(int j =0;j<a[i].length;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	for(int n[]:a) {
		System.out.print(Arrays.toString(n)+"\n");
	}
	
	
}
}
