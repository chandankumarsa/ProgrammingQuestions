package MargesortPrectice;

import java.util.Arrays;

public class MargeSortProgram {
public static void main(String[] args) {
	int a[]= {6,3,5,7,8};
	sort(a);
	System.out.println(Arrays.toString(a));
	
}
static void sort(int a[]) {
	if(a.length<=1)return;
	int mid =a.length/2;
	int left[]=new int[mid];
	int right[]=new int[a.length-mid];
	for(int i =0;i<left.length;i++) {
		left[i]=a[i];
	}
	for(int i=0;i<right.length;i++) {
		right[i]=a[mid+i];
	}
	sort(left);
	sort(right);
	marge(left, right,a);
}
static void marge(int a[],int b[],int c[]) {
	int i =0,j=0,k=0;
	while(i<a.length && j<b.length) {
		if(a[i]<b[j]) {
			c[k++]=a[i++];
		}else c[k++]=b[j++];
	}
	while(i<a.length)c[k++]=a[i++];
	while(j<b.length)c[k++]=b[j++];
}
}
