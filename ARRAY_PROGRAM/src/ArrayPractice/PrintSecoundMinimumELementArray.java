package ArrayPractice;

public class PrintSecoundMinimumELementArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	int min=Integer.MAX_VALUE;
	int secmin=Integer.MAX_VALUE;
	for(int n:a) {
		if(n<min) {
			secmin=min;
			min =n;
		}else if(n<secmin && n!=min) {
			secmin=n;
		}
	}
	System.out.println("Secound Minimum ELement "+secmin);
}
}
