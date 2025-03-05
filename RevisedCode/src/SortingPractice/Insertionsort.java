package SortingPractice;

import java.util.Arrays;

public class Insertionsort {
public static void main(String[] args) {
	int a[]= {5,8,9,7,6,4};
	sort(a);
	System.out.println(Arrays.toString(a));
}
static void sort(int a[]) {
	for(int i =1;i<a.length;i++) {
		int j =i-1;
		int k =a[i];
		while(j>=0 && a[j]>k) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=k;
	}
}
}
