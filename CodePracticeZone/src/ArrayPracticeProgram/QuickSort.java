package ArrayPracticeProgram;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int a[] = { 9, 57, 69, 4 };
		sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	static void sort(int a[], int st, int end) {
		if (st >= end)
			return;
		int pivot = a[(st + end) / 2];
		int i = st;
		int j = end;
		while (i <= j) {
			while (a[i] < pivot)
				i++;
			while (a[j] > pivot)
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
