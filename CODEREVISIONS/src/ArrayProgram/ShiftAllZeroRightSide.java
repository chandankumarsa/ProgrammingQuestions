package ArrayProgram;

import java.util.Arrays;

public class ShiftAllZeroRightSide {
public static void main(String[] args) {
	int a[]= {1,2,0,4,0,6,0,7,8,9};
	int b[]=new int [a.length];
	int j =0;
	for(int i =0;i<a.length;i++) {
		if(a[i]!=0) {
			b[j]=a[i];
			j++;
		}
	}
	System.out.println(Arrays.toString(b));
}
}
