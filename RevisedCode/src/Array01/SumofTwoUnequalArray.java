package Array01;

import java.util.Arrays;

public class SumofTwoUnequalArray {
public static void main(String[] args) {
	int a[]= {69,2,3,5,6,8,9,69};
	int b[]= {1,2,3,4,5};
	int n =a.length<b.length?a.length:b.length;
	for(int i =0;i<n;i++) {
		if(a.length>b.length) a[i]=a[i]+b[i];
		else b[i]=a[i]+b[i];
	}
	String res =a.length>b.length?Arrays.toString(a):Arrays.toString(b);
	System.out.println(res);
}
}
