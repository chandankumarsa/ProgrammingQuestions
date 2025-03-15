package ArrayProgram;

public class Linearsearch {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	System.out.println(search(a, 3));
}
static int search(int a[],int k) {
	for(int i =0;i<a.length;i++) {
		if(a[i]==k)return i;
	}
	return -1;
}
}
