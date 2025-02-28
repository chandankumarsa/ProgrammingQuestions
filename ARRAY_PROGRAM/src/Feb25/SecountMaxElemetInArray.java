package Feb25;

public class SecountMaxElemetInArray {
public static void main(String[] args) {
	int a[]= {2,1,3,5,4,9,6};
	int max1=0;
	int max2=0;
	for(int i =0;i<a.length;i++) {
		if(a[i]>max1) {
			max2=max1;
			max1=a[i];
		}else if(a[i]>max2 && a[i]!=max1) {
			max2=a[i];
		}
	}
	System.out.println(max1);
	System.out.println(max2);
}
}
