package RevisedProgram05;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int a[]= {5,7,9,4,3,2,1};
	sort(a);
	System.out.println(Arrays.toString(a));
}
static void sort(int a[]) {
	for(int i =0;i<a.length;i++) {
		for(int j =0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
				int temp =a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
}
}
