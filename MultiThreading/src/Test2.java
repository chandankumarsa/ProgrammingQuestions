class Mythread1 extends Thread{
	@Override
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println("Child thread: "+i);
		}
	}
}
public class Test2 {
public static void main(String[] args) {
	Mythread1 t1 = new Mythread1();
	t1.setPriority(9);
	System.out.println(t1.getPriority());
//	t1.setPriority(12);//Exception
	System.out.println(Thread.currentThread().getPriority());
	t1.start();
	
	for(int i =1;i<=10;i++) {
		System.out.println("Main Thread "+i);
	}
	
}
}
