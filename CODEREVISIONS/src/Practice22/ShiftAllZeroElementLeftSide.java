package Practice22;

import java.util.Arrays;

public class ShiftAllZeroElementLeftSide {
public static void main(String[] args) {
	int a[]= {1,2,0,3,0,4,0,5,0,6};
	int b []= new int[a.length];
	int j =a.length-1;
	for(int i =a.length-1;i>=0;i--) {
		if(a[i]!=0) {
			b[j]=a[i];
			j--;
		}
	}
	System.out.println(Arrays.toString(b));
	
}
}
