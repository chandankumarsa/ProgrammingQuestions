package ArrayProgramPractice;

public class SecminElement {
public static void main(String[] args) {
	int a[] = { 10, 20, 3, 4, 5 };
	int min =Integer.MAX_VALUE;
	int secmin =Integer.MIN_VALUE;
	for(int i =0;i<a.length;i++) {
		if(a[i]<min) {
			secmin=min;
			min =a[i];
		}
		else if(a[i]<secmin && a[i]!=min) {
			secmin=a[i];
		}
	}
	System.out.println(secmin);
}
}
