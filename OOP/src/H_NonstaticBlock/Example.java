package H_NonstaticBlock;
class D{
	//static block
	static {
		System.out.println("Static block in D");
	}
	//Non-static block
	{
		System.out.println("nonstatic block in D");
	}
	//constructor
	D(){
		System.out.println("Constructor in D ");
	}
}
public class Example {
public static void main(String[] args) {
	new D();
	new D();
}
}
