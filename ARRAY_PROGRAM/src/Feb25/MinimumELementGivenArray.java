package Feb25;

public class MinimumELementGivenArray {
public static void main(String[] args) {
	int []a= {5,6,1,8,5};
	int min =Integer.MAX_VALUE;
	for(int n:a) {
		if(n<min) {
			min=n;
		}
	}
	System.out.println(min);
}
}
