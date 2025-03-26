package ArrayProgramPractice;

public class SumOfEvenOdd {
public static void main(String[] args) {
	int esum =0;
	int osum =0;
	int a[]= {1,2,3,4,5,6};
	for(int n:a) {
		if(n%2==0)esum+=n;
		else osum+=n;
	}
	System.out.println(esum);
	System.out.println(osum);
}
}
