package Sorting;

import java.util.Arrays;

public class Insertionsort {
public static void main(String[] args) {
	int a[] = { 6, 8, 9, 5, 4 };
	sort(a);
	System.out.println(Arrays.toString(a));
}
static void sort(int a[]) {
	for(int i =1;i<a.length;i++) {
		int k = a[i];
		int j =i-1;
		while(j>=0 && a[j]>k) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=k;
	}
}
}
