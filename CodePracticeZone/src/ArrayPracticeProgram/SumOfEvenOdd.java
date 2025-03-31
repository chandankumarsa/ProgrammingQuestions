package ArrayPracticeProgram;

public class SumOfEvenOdd {
public static void main(String[] args) {
	int a[]= {5,6,9,4};
	int esum =0;
	int osum =0;
	for(int n:a) {
		if(n%2==0) {
			esum+=n;
		}
		else osum+=n;
	}
	System.out.println("  Sum  of Even  : "+esum);
System.out.println("  sum of Odd  : "+osum);
}
}
