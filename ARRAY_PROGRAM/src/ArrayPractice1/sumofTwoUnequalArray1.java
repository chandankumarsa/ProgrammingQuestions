package ArrayPractice1;
import java.util.Arrays;
public class sumofTwoUnequalArray1 {
public static void main(String[] args) {
	int[] a = { 6, 69, 3 };
	int[] b = { 9, 2, 3, 4, 5, 6 };
	int n =a.length<b.length?a.length:b.length;
	for(int i =0;i<a.length;i++) {
		if(a.length>b.length)a[i]=b[i]+a[i];
		else b[i]=b[i]+a[i];
		
	}
	String res =a.length>b.length?Arrays.toString(a):Arrays.toString(b);
	System.out.println(res);
}
}
