package Feb25;

public class SecountMinElemetInArray {
public static void main(String[] args) {
	int a[]= {2,1,3,5,4,9,6};
	int min1=Integer.MAX_VALUE;
	int min2=Integer.MAX_VALUE;
	for(int n:a) {
		if(n<min1) {
			min2=min1;
			min1=n;
		}else if(n<min2 && n!=min1) {
			min2=n;
		}
	}
	System.out.println(min1);
	System.out.println(min2);
}
}
