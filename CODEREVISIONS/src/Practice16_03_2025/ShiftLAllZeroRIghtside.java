package Practice16_03_2025;

import java.util.Arrays;

public class ShiftLAllZeroRIghtside {
public static void main(String[] args) {
	int a[]= {1,0,2,0,3,0,4};
	int b []= new int[a.length];
	int j =0;
	for(int i =0;i<=a.length-1;i++) {
		if(a[i]!=0) {
			b[j]=a[i];
			j++;
		}
	}
	System.out.println(Arrays.toString(b));
	
}
}
