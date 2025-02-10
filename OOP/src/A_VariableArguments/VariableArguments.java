package A_VariableArguments;

public class VariableArguments {
	static void m1(int... a) {
		System.out.println("M1 is called");
	}

	public static void main(String[] args) {

		m1(10);
		m1(20, 30, 40);
	}

}

//By using variable arguments we can make a methods 
//to Accept N Number of arguments