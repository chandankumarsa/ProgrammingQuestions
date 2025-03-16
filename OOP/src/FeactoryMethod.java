class A {
	int i;

	A(int i) {
		this.i = i;
	}
}
class B {
	static A disp() {
		A a1 = new A(20);
		return a1;
	}

}
public class FeactoryMethod {
	public static void main(String[] args) {
		A a1 = B.disp();
		System.out.println(a1.i);
	}
}


//https://app.joinsuperset.com/join/#/signup/student/jobprofiles/3eb93c5e-13a6-48cc-8d94-d29773a54388