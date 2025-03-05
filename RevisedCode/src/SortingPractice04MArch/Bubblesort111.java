package SortingPractice04MArch;

import java.util.Arrays;

public class Bubblesort111 {
public static void main(String[] args) {
	int a[]= {6,98,5,2,9};
	srt(a);
	System.out.println(Arrays.toString(a));
}
static void srt(int a[]) {
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
