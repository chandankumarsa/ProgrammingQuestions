package ArrayProgram;

public class RemoveDuplicateElementArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 2, 1, 4, 5, 6 };
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == max)
				continue;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = max;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}
