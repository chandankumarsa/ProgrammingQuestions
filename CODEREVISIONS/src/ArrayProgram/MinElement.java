package ArrayProgram;
public class MinElement {
	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int a[] = { 1, 2, 0, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
