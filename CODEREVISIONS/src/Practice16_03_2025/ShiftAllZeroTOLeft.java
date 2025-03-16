package Practice16_03_2025;

import java.util.Arrays;

public class ShiftAllZeroTOLeft {
public static void main(String[] args) {
	int a[]= {1,0,2,0,3,0,4};
	int b []= new int[a.length];
	int j =b.length;
	for(int i=a.length-1;i>=0;i--) {
		while(j!=0) {
			b[j]=a[i];
			j--;
		}
	}
	System.out.println(Arrays.toString(a));
}
}
