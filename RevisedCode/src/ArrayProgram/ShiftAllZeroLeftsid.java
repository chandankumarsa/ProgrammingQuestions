package ArrayProgram;

import java.util.Arrays;

public class ShiftAllZeroLeftsid {
public static void main(String[] args) {
	int a[]= {1,2,3,0,4,5,0};
	int b[]= new int [a.length];
	int j =a.length-1;
	for(int i=a.length-1;i>=0;i--) {
		if(a[i]!=0) {
			b[j]=a[i];
			j--;
		}
	}
	System.out.println(Arrays.toString(b));
}
}
