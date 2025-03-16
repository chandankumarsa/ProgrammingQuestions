package Practice16_03_2025;

public class MinElement {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
