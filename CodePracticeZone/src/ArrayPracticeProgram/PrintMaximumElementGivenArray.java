package ArrayPracticeProgram;

public class PrintMaximumElementGivenArray {
public static void main(String[] args) {
	int a[]= {5,6,9,4};
	int max =Integer.MIN_VALUE;
	for(int i =0;i<a.length;i++) {
		if(a[i]>max) {
			max = a[i];
		}
	}
	System.out.println(max);
}
}
