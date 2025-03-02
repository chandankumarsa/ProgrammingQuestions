package Array02;

import java.util.Arrays;

public class Bubblesort1 {
public static void main(String[] args) {
	int a[]= {6,3,2,4,8,88,5};
	sort(a);
	System.out.println(Arrays.toString(a));
}
static void sort(int a[]) {
	for(int i =0;i<a.length-1;i++) {
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