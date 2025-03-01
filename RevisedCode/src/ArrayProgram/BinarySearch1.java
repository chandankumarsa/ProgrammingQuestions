package ArrayProgram;

public class BinarySearch1 {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60};
	System.out.println(search(a, 30, 0, a.length-1));
}
static int search(int a[],int k,int st,int end) {
	if(st>end)return -1;
	int mid =(st+end)/2;
	if(k==a[mid])return mid;
	else if(k<a[mid])return search(a, k, st, mid-1);
	return search(a, k, mid+1, end);
}
}
