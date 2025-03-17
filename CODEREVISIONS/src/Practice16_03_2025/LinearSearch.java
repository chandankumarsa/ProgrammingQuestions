package Practice16_03_2025;

public class LinearSearch {
public static void main(String[] args) {
	int a[]= {12,22,32,42,52,62};
	System.out.println(search(a, 62));
}
static int  search(int a[],int k) {
	for(int i =0;i<a.length;i++) {
		if(a[i]==k)return i;
	}
	return -1;
}
}
