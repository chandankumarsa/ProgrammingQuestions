package ArrayPractice1;

public class MaximumElementGivenArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	int max =Integer.MIN_VALUE;
	for(int n:a) {
		if(n>max) {
			max=n;
		}
	}
	System.out.println(max);
}
}
