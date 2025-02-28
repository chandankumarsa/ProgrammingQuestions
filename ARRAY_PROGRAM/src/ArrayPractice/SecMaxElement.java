package ArrayPractice;

public class SecMaxElement {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for (int n : a) {
			if (n > max) {
				secMax = max;
				max = n;
			} else if (n > secMax && n != max) {
				secMax = n;
			}
		}
		System.out.println("Secound max ELement : "+secMax);
	}
}
