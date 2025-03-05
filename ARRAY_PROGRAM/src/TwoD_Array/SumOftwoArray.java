package TwoD_Array;

import java.util.Arrays;

public class SumOftwoArray {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 1, 4, 5 }, { 6, 5, 4 } };
		int[][] b = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] c = new int[a.length][a.length]; // Use a[0].length instead of a.length

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		// Print the final matrix
		for (int[] n : c)
			System.out.println(Arrays.toString(n));
	}
}
