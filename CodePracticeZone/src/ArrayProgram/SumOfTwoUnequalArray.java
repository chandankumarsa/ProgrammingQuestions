package ArrayProgram;

import java.util.Arrays;

public class SumOfTwoUnequalArray {
public static void main(String[] args) {
	int a[]= {9,2,3};
	int b[] = { 1, 2, 3, 4 };
	int n =a.length<b.length?a.length:b.length;
	for(int i =0;i<n;i++) {
		if(a.length>b.length) 
			a[i]=a[i]+b[i];
		else b[i]=b[i]+a[i];
	}
	String res =a.length>b.length?Arrays.toString(a):Arrays.toString(b);
	System.out.println(res);
}
}
