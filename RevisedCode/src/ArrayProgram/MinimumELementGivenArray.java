package ArrayProgram;

public class MinimumELementGivenArray {
public static void main(String[] args) {
	int a[]= {11,2,3,11,4};
	int min=a[0];
	for(int n:a) {
		if(n<min) {
			min=n;
		}
	}
	System.out.println("Minimum Element is : "+min);
}
}
