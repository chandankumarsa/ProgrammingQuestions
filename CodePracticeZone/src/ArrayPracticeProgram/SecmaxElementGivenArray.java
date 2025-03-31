package ArrayPracticeProgram;

public class SecmaxElementGivenArray {
public static void main(String[] args) {
	int a[]= {5,6,9,4};
	int max =Integer.MIN_VALUE;
	int secmax = Integer.MIN_VALUE;
	for(int i =0;i<a.length;i++) {
		if(a[i]>max) {
			secmax = max;
			max = a[i];
		}
		else if(a[i]>secmax) {
			secmax = a[i];
		}
	}
	System.out.println("Secmax is : "+secmax);
}
}
