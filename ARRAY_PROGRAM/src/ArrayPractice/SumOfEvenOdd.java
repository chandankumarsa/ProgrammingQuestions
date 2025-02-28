package ArrayPractice;

public class SumOfEvenOdd {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8};
	int esum =0;
	int osum=0;
	for(int n:a) {
		if(n%2==0) {
			esum+=n;
		}
		else osum+=n;
	}
	System.out.println("Sum of even:"+esum);
	System.out.println("SUm of Odd: "+osum);
}
}
