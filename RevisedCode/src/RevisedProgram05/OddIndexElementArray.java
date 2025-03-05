package RevisedProgram05;

public class OddIndexElementArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	for(int i =1;i<=a.length-1;i+=2) {
		System.out.println(a[i]);
	}
}
}
