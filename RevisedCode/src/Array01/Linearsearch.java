package Array01;

public class Linearsearch {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	System.out.println(linear(a, 2));
}
static int linear(int a[],int k) {
	
	for(int i =0;i<a.length;i++) {
		if(a[i]==k)return i;
	}
	return -1;
}
}
