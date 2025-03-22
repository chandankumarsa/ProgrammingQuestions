package ArrayProgram;

public class LinearSearch {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	System.out.println(search(a, 50));
}
static int search(int a[],int k) {
	for(int i =0;i<a.length;i++) {
		if(a[i]==k)return i;
	}
	return -1;
}
}
