package ArrayProgram;

import java.util.Arrays;

public class ShiftZeroRight {
public static void main(String[] args) {
	int a[]= {1,0,3,0,5,6,0,7,0,9};
	int b[]=new int[a.length];
	int j=0;
	for(int i =0;i<a.length;i++) {
		if(a[i]!=0) {
			b[j]=a[i];
			j++;
		}
	}
	System.out.println(Arrays.toString(b));
}
}
