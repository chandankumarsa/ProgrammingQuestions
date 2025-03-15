package ArrayProgram;

import java.util.Arrays;

public class Quicksort {
public static void main(String[] args) {
	int a[]= {6,9,4,3,14,8};
	sort(a,0,a.length-1);
	System.out.println(Arrays.toString(a));
}
static void sort(int a[],int st,int end) {
	if(st>end)return;
	int i=st;
	int j=end;
	int pivort=a[(st+end)/2];
	while(i<=j) {
		while(a[i]<pivort)i++;
		while(a[j]>pivort)j--;
		if(i<=j) {
			int temp =a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
	sort(a, st, j);
	sort(a, i, end);
}
}
