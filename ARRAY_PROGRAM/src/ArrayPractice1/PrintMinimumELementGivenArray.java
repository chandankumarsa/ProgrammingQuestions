package ArrayPractice1;

public class PrintMinimumELementGivenArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	int min =Integer.MAX_VALUE;
	for(int n:a) {
		if(n<min) {
			min=n;
		}
	}
	System.out.println(min);
}
}
