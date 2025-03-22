package ArrayProgram;

public class PrintSecminElement {
public static void main(String[] args) {
	int min =Integer.MAX_VALUE;
	int secmin =Integer.MAX_VALUE;
	int a[]= {1,2,69,3,4,5};
	for(int i =0;i<a.length;i++) {
		if(a[i]<min) {
			secmin= min;
			min = a[i];
		}
		else if(a[i]<secmin) {
			secmin=a[i];
		}
	}
	System.out.println("Sec-Min ELement is : "+secmin);
}
}
