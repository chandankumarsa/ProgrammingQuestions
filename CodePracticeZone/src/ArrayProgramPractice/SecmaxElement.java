package ArrayProgramPractice;

public class SecmaxElement {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		int a[] = { 10, 20, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secmax = max;
				max = a[i];
			} else if (a[i] >secmax && a[i] != max) {
				secmax = a[i];
			}
		}
		System.out.println(secmax);
	}
}
