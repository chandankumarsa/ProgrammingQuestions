package Array01;

public class MinElementGivenArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int min = Integer.MAX_VALUE;
		for (int n : a) {
			if (n < min) {
				min = n;
			}
		}
		System.out.println(min);
	}
}
