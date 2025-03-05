package ArrayPractice1;

public class Linearsearch1 {
public static void main(String[] args) {
	int a[]= {9,5,7,6,15,1};
	System.out.println(find(a, 7));
	
}
static int find(int a[],int k) {
	for(int i =0;i<a.length;i++) {
		if(a[i]==k)return i;
	}
	return-1;
}
}
