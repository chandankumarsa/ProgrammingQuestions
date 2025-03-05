package TwoD_Array;

import java.util.Arrays;

public class Static2dArray {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 3, 4 }, { 1, 2, 3, 4, 5 } };
		for(int n[]:a) {
			System.out.print(Arrays.toString(n)+"\n");
		}
	}
}
