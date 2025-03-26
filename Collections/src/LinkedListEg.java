import java.util.LinkedList;

public class LinkedListEg {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("jsp");
		l.add("Qsp");
		l.add("Psp");
		l.add("Prosp");
		l.add("Gsp");
		l.add("Tsp");
		System.out.println(l.get(2));
		l.add(2, "chandan");
		System.out.println(l);
		System.out.println(l.isEmpty());
	}
}
