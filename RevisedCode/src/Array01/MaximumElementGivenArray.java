package Array01;

public class MaximumElementGivenArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int max =0;
	for(int n:a) {
		if(n>max) {
			max =n;
		}
	}
	System.out.println(max);
}
}
