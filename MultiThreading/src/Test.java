class Mythread extends Thread{
	@Override
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println("Child thread: "+i);
		}
	}
}
public class Test {
public static void main(String[] args) {
	Mythread t1 = new Mythread();
	t1.start();
	for(int i =1;i<=10;i++) {
		System.out.println("Main Thread "+i);
	}
	
}
}
