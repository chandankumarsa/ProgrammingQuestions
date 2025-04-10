package SortingTechnique;

import java.util.Arrays;

public class Insertionsort {
	public static void main(String[] args) {
		int a[] = { 4, 6, 5, 2 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int j = i - 1;
			int k = a[i];
			while (j >= 0 && a[j] > k) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = k;
		}
	}
}
