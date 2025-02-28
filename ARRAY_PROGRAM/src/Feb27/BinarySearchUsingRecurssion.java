package Feb27;

public class BinarySearchUsingRecurssion {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,69};
	System.out.println(find(a, 69, 0, a.length-1));
}
static int find(int a[],int key,int st,int end) {
	if(st>end)return -1;
	int mid =(st+end)/2;
	if(key==a[mid])return mid;
	else if(key<a[mid])return find(a, key, st, mid-1);
	else return find(a, key, mid+1, end);
}
}

