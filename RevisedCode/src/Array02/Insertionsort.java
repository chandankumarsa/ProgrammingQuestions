package Array02;

import java.util.Arrays;

public class Insertionsort {
public static void main(String[] args) {
	int a[]= {11,2,33,64,15,6};
	sort(a);
	System.out.println(Arrays.toString(a));
}
static void sort(int a[]) {
	for(int i =1;i<a.length;i++) {
		int key=a[i];
		int j=i-1;
		while(j>=0 && a[j]>key) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
}
}
