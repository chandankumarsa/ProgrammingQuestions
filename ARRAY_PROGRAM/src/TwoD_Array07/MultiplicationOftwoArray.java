package TwoD_Array07;

import java.util.Arrays;

public class MultiplicationOftwoArray {
public static void main(String[] args) {
	int[][] a = { { 1, 2, 3 }, { 1, 4, 5 }, { 6, 5, 4 } };
	int[][] b = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
	int[][] c = new int[a.length][a.length]; 
	for(int i =0;i<a.length;i++) {
		for(int j =0;j<a.length;j++) {
			for(int k =0;k<a.length;k++) {
				c[i][j]+=a[i][k]*b[k][j];
			}
		}
	}
	for(int[]n:c) {
		System.out.println(Arrays.toString(n));
	}
}
}
