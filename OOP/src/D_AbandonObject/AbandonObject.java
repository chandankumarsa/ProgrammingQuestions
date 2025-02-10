package D_AbandonObject;

public class AbandonObject {
public static void main(String[] args) {
	Account a1 = new Account();
	a1.bal=1000;
	System.out.println("a1.bal= "+a1.bal);
	a1 = new Account();
	System.out.println("a1.bal = "+a1.bal);
}
}
