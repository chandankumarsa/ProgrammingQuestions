package ArrayPractice1;
public class PrintSecmax {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	int max =Integer.MIN_VALUE;
	int secmax=Integer.MIN_VALUE;
	for(int n:a) {
		if(n>max) {
			secmax = max;
			max =n;
			
		}
		else if(n>secmax && n!=max) {
			secmax=n;
		}
	}
	System.out.println(secmax);
}
}
