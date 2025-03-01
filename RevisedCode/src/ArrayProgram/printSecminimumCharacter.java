package ArrayProgram;

public class printSecminimumCharacter {
public static void main(String[] args) {
	int a[]= {69,33,3,22,5,};
	int min =Integer.MAX_VALUE;
	int secmin=Integer.MAX_VALUE;
	for(int i =0;i<a.length;i++) {
		if(a[i]<min) {
			secmin=min;
			min =a[i];
		}
		else if(a[i]<secmin && a[i]!=min) {
			secmin=a[i];
		}
	}
	System.out.println("Secound Minimum ELement : "+secmin);
}
}
