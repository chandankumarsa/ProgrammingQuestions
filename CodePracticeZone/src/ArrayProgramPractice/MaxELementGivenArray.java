package ArrayProgramPractice;

public class MaxELementGivenArray {
public static void main(String[] args) {
	int a[]= {10,20,30,40};
	int max =Integer.MIN_VALUE;
	for(int i =0;i<a.length;i++) {
		if(a[i]>max) {
			max = a[i];
		}
	}
	System.out.println(max);
}
}
