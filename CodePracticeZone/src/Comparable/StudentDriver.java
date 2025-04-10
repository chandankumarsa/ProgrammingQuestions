package Comparable;

import java.util.Arrays;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student("chandan", 21, 90);
		Student s2 = new Student("abhi", 12, 80);
		Student s3 = new Student("Biswajeet", 23, 70);
		Student s4 = new Student("chi", 18, 50);
		Student s5 = new Student("Rakesh", 11, 40);
		Student[] s = { s1, s2, s3, s4, s5 };
		Arrays.sort(s);
		for (Student std : s) {
			System.out.println(std);
		}
	}
}
