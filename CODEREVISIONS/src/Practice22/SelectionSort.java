package Practice22;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int a[]= {6,9,5,2,3};
	sort(a);
	System.out.println(Arrays.toString(a));
}
static void sort(int a[]) {
	for(int i =0;i<a.length-1;i++) {
		int index =i;
		for(int j =i+1;j<a.length;j++) {
			if(a[j]<a[index])index=j;
		}
		int temp =a[index];
		a[index]=a[i];
		a[i]=temp;
	}
}
}
