package ArrayProgram18;

public class SecmaxElement {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int max =Integer.MIN_VALUE;
	int secmax =Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			secmax =max;
			max = a[i];
		}
		else if(a[i]>secmax && a[i]!=max) {
			secmax=a[i];
		}
	}
	System.out.println(secmax);
}
}
