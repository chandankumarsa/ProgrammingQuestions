package Array01;

import java.util.Arrays;

public class ShiftZeroRightside {
public static void main(String[] args) {
	int a[] = { 5, 0, 2, 0, 1, 0, 69 };
	int b[]=new int [a.length];
	int j =0;
	for(int i =0;i<a.length-1;i++) {
		if(a[i]!=0) {
			b[j]=a[i];
			j++;
		}
	}
	System.out.println(Arrays.toString(b));
}
}
