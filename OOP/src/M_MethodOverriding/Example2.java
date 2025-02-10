package M_MethodOverriding;
class AA{
	void m1() {
		System.out.println(" m1() - A ");
	}
}
class BB extends AA{
	@Override
	void m1() {
		System.out.println(" m1() - B ");
	}
}
class CC extends BB{
	
}
class DD extends CC{
	@Override
	void m1() {
		System.out.println("m1()-D");
	}
}
public class Example2 {
public static void main(String[] args) {
	DD d = new DD();
	d.m1();
	CC c = new CC();
	c.m1();
}
}
