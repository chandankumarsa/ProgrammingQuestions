package Practice20;

public class SumoFprimaryDiagonal {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 3, 1, 4 }, { 5, 7, 4 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i + j == a.length - 1)
					sum += a[i][j];
			}
		}
		System.out.println(sum);
	}
}
