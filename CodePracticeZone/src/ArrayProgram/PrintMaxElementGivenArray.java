package ArrayProgram;

public class PrintMaxElementGivenArray {
public static void main(String[] args) {
	int max = Integer.MIN_VALUE;
	int a[]= {1,2,69,3,4,5};
	for(int i =0;i<a.length;i++) {
		if(a[i]>max) {
			max = a[i];
		}
	}
	System.out.println(max);
}
}
