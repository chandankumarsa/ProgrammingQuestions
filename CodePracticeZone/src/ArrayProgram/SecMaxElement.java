package ArrayProgram;

public class SecMaxElement {
public static void main(String[] args) {
	int max= Integer.MIN_VALUE;
	int secmax = Integer.MIN_VALUE;
	int a[]= {1,2,69,3,4,5};
	for(int i =0;i<a.length;i++) {
		if(a[i]>max) {
			secmax=max;
			max = a[i];
		}else if(a[i]>secmax && a[i]!=max) {
			secmax =a[i];
		}
	}
	System.out.println(secmax);
}
}
