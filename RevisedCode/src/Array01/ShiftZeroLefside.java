package Array01;

import java.util.Arrays;

public class ShiftZeroLefside {
public static void main(String[] args) {
	int a[] = { 5, 0, 2, 0, 1, 0, 69 };
	int b[]=new int [a.length];
	int j =b.length-1;
	for(int i =a.length-1;i>=0;i--) {
		if(a[i]!=0) {
			b[j]=a[i];
			j--;
		}
	}
	System.out.println(Arrays.toString(b));
}
}
