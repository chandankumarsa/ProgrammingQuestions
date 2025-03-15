package ArrayProgram;

public class EvenElementGivenArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	for(int n:a) {
		if(n%2==0) {
			System.out.println(n);
		}
	}
}
}
