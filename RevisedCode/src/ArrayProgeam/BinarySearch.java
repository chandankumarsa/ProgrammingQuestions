package ArrayProgeam;

public class BinarySearch {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	System.out.println(search(a, 5, 0, a.length-1));
}
static int search(int a[],int k,int st,int end) {
	if(st>end)return -1;
	int mid =(st+end)/2;
	if(k==a[mid])return mid;
	else if(k<a[mid])return search(a, k, st, mid-1);
	else return search(a, k, mid+1, end);
	
}
}
