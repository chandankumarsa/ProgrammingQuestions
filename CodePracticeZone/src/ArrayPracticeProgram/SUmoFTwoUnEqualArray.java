package ArrayPracticeProgram;

import java.util.Arrays;

public class SUmoFTwoUnEqualArray {
public static void main(String[] args) {
	int a[] = {5, 6, 0, 0, 0, 9, 0, 4};
	int b[]= {1,1,1};
	int n = a.length<b.length?a.length:b.length;
	for(int i =0;i<n;i++) {
		if(a.length>b.length) a[i]=a[i]+b[i];
		else b[i]=a[i]+b[i];
	}
	String res =a.length>b.length?Arrays.toString(a):Arrays.toString(b);
	System.out.println(res);
}
}
