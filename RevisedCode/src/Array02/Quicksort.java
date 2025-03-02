package Array02;

import java.util.Arrays;

public class Quicksort {
public static void main(String[] args) {
	int a[]= {11,2,33,64,15,6};
	quicksort(a, 0, a.length-1);
	System.out.println(Arrays.toString(a));
}
static void quicksort(int a[],int st,int end) {
	if(st>=end)return;
	int pivot=a[(st+end)/2];
	int i=st;
	int j =end;
	while(i<=j) {
		while(a[i]<pivot)i++;
		while(a[j]>pivot)j--;
		if(i<=j) {
			int temp =a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
	quicksort(a, st, j);
	quicksort(a, i, end);
}
}
