import java.util.ArrayList;
import java.util.List;
public class ArrayList_Eg {
public static void main(String[] args) {
	List a = new ArrayList();
	a.add(10);
	a.add(8.8);
	a.add("Ram");
	a.add('A');
	a.add(9.8f);
	a.add(new String("Sita"));
	a.add(876543);
	a.add(3,"Ramana");
	System.out.println(a);
	System.out.println(a.remove(3));
	System.out.println(a);
	System.out.println(a.contains(8.8));
	System.out.println(a.contains(5));
	ArrayList a2 = new ArrayList();
	a2.addAll(a);
	System.out.println(a2);
	a2.add(50);
	a2.add(60);
	a2.add(70);
	a2.add(80);
	a2.remove(2);
	System.out.println(a2);
	System.out.println(a2.contains(a));//false
	a2.retainAll(a);
	System.out.println(a2);
	a2.clear();
	System.out.println(a2);
}
}
