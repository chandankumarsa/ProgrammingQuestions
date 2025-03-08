package ArrayProgram;

public class SumOfEvenOdd {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int esum=0;
	int osum=0;
	for(int n:a) {
		if(n%2==0) {
			esum+=n;
		}else osum+=n;
	}
	System.out.println("Esum "+esum);
	System.out.println("Osum "+osum);
}
}
