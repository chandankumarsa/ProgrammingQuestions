package Practice16_03_2025;

public class SecmnElement {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int min = Integer.MAX_VALUE;
		int secmin = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				secmin = min;
				min = a[i];
			} else if (a[i] < secmin && a[i] != min) {
				secmin = a[i];
			}
		}
		System.out.println(secmin);
	}
}
