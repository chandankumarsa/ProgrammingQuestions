package ArrayProgramPractice;

import java.util.Arrays;

public class RemoveDiplicateElement {
	public static void main(String[] args) {
		int a[] = { 10, 30, 20, 30, 40, 50, 60, 20, 10 };
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			int count =0;
			if (a[i] == max)
				continue;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = max;
				}
			}
			System.out.println(a[i]);
		}
	}
}
