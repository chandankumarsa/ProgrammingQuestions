package RevisedProgram05;

public class EvenElementArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	System.out.println("Sum of Even Element Array");
	for(int n:a) {
		if(n%2==0) {
			System.out.print(n +" ");
		}
		
	}
}
}
