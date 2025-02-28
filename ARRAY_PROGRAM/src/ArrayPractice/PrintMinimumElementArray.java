package ArrayPractice;

public class PrintMinimumElementArray {
public static void main(String[] args) {
	int a[]= {6,3,2,4,5};
	int min =Integer.MAX_VALUE;
	for(int n:a) {
		if(n<min) {
			min=n;
		}
	}
	System.out.println("Minimum ELement of an array is : "+min);
}
}
