package Practice22;

public class PrintSecmaxElement {
public static void main(String[] args) {
	int a[] = { 1, 20, 3, 4, 5 };
	int max =Integer.MIN_VALUE;
	int secmax=Integer.MIN_VALUE;
    for(int i =0;i<a.length;i++) {
		if(a[i]>max) {
			secmax=max;
			max = a[i];
		}else if(a[i]>secmax) {
			secmax=a[i];
		}
	}
	System.out.println(secmax);
}
}
