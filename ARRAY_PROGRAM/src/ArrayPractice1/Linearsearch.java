package ArrayPractice1;

public class Linearsearch {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8};
	System.out.println(find(a, 2));
}
static int find(int[]a,int key) {
	for(int i =0;i<a.length;i++) {
		if(a[i]==key)return i;
	}
	return -1;
}
}
