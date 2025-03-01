package ArrayProgram;

public class MaximumElementArray {
public static void main(String[] args) {
	int a[]= {1,2,33,4,5,6,7};
	int max=a[0];
	for(int n:a) {
		if(n>max) {
			max=n;
		}
	}
	System.out.println("maximum Element is : "+max);
	
}
}
