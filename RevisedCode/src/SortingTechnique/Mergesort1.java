package SortingTechnique;

import java.util.Arrays;

public class Mergesort1 {
	public static void main(String[] args) {
		int a[] = { 9, 6, 8, 5, 48, 4 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	static void sort(int a[]) {
		if (a.length <= 1)
			return;
		int mid = a.length / 2;
		int left[] = new int[mid];
		int right[] = new int[a.length - mid];
		for (int i = 0; i < left.length; i++) {
			left[i] = a[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = a[mid + i];
		}
		sort(left);
		sort(right);
		merge(left, right, a);
	}

	static void merge(int a[], int b[], int c[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];
	}
}
