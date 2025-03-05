package RevisedProgram05;

public class SumofEvenOddElementArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	int esum=0;
	int osum =0;
	for(int n:a) {
		if(n%2==0)esum+=n;
		else osum+=n;
	}
	System.out.println("Sum of even Number : "+esum);
	System.out.println("Sum of Odd Number : "+osum);
}
}
