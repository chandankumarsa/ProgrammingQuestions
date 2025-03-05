package RevisedProgram05;

import java.util.Arrays;

public class ShiftZeroRIghtside {
public static void main(String[] args) {
	int a[] = { 1, 2, 0, 3, 4, 0, 0, 6, 6 };
	int b []=new int[a.length];
	int j =0;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
			b[j]=a[i];
			j++;
		}
	}
	System.out.println(Arrays.toString(b));
}
}
