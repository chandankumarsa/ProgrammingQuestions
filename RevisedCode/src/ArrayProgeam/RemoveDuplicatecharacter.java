package ArrayProgeam;

public class RemoveDuplicatecharacter {
public static void main(String[] args) {
	int a[]= {1,5,6,4,5,1,2};
	int maxcount =Integer.MAX_VALUE;
	for(int i =0;i<a.length;i++) {
		if(a[i]==maxcount)continue;
		for(int j =i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				a[j]=maxcount;
			}
		}
		System.out.println(a[i]);
	}
}
}
