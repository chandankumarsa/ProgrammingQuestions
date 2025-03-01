package ArrayProgram;

public class Linearsearch1 {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60};
	System.out.println(linearsearch(a, 60));
}
static int linearsearch(int a[],int k) {
	for(int i =0;i<a.length;i++) {
		if(a[i]==k) return i;
	}
	return -1;
}
}
