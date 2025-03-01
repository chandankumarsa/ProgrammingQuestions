package Array01;

public class Printsecmax {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int max =Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;
	for(int i =0;i<a.length;i++) {
		if(a[i]>max) {
			max2=max;
			max=a[i];
		}
		else if(a[i]>max2 && a[i]!=max) {
			max2=a[i];
		}
	}
	System.out.println(max2);
}
}
