package Stack_Implementations;

public class UserProgram {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		System.out.println(" =============================== ");
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
		System.out.println(" =============================== ");
	}
}
