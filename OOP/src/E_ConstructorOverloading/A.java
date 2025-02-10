package E_ConstructorOverloading;
class B{
	B(){
		System.out.println("No Arg Constructor");
	}
	B(int i){
		System.out.println("int Arg Constructor");
	}
	B(int i,int j){
		System.out.println("2 int Arg Constructor");
	}
}
public class A {
public static void main(String[] args) {
	new B();
	new B(10);
	new B(20,30);
}
}
