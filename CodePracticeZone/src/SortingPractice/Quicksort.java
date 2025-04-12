package SortingPractice;

import java.util.Arrays;
import java.util.SortedMap;

public class Quicksort {
	public static void main(String[] args) {
		int a[] = { 69, 2, 14, 5 };
		sort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}

	public static  void sort(int a[], int st, int end) {
		if (st >= end)
			return;
		int pivort = a[(st + end) / 2];
		int i = st;
		int j = end;
		while (i <= j) {
			while (a[i] < pivort)
				i++;
			while (a[j] > pivort)
				j--;
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		sort(a, st, j);
		sort(a, i, end);		
	}
}
