package D_AbandonObject;

public class Account {
double bal;

}
class test{
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.bal=1000;
		System.out.println(" a1.bal "+a1.bal);
		Account a2 = a1;
		a2.bal= 2000;
		System.out.println(" a2.bal "+a2.bal);
		a2.bal=2000;
		System.out.println(" a2.bal "+a2.bal);
		System.out.println(" a1.bal "+a1.bal);
	}
}
