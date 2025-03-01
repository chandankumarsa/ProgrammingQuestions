package Array01;

public class PrintsecminElement {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int min =Integer.MAX_VALUE;
	int min2=Integer.MAX_VALUE;
	for(int i =0;i<a.length;i++) {
		if(a[i]<min) {
			min2=min;
			min=a[i];
		}
		else if(a[i]<min2 && a[i]!=min) {
			min2=a[i];
		}
	}
	System.out.println(min2);
}
}
