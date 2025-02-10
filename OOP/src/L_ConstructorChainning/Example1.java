package L_ConstructorChainning;
class C{
	C(){
		System.out.println("C class Constructor");
	}
}
class D extends C{
	D(){
		System.out.println("D class Constructor");
	}
}
class E extends D{
	E(){
		System.out.println("E class Constructor");
	}
}
public class Example1 {
public static void main(String[] args) {
	new E(); //default call to super (Automatic Calling of Parent constructor)
}
}
