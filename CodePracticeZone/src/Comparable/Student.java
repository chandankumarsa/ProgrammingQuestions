package Comparable;

public class Student implements Comparable {
	String name;
	int age;
	int marks;

	public Student(String name, int age, int marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		if (this.marks > s.marks)
			return 1;
		else if (this.marks < s.marks)
			return -1;
		return 0;

	}

}
