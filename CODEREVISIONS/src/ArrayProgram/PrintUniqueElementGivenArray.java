package ArrayProgram;

public class PrintUniqueElementGivenArray {
public static void main(String[] args) {
	int a[]= {1,2,2,3,4,6,3,9};
	for(int i =0;i<a.length;i++) {
		int count =0;
		for(int j =0;j<a.length;j++) {
			if(a[i]==a[j])count++;
		}
		if(count==1)System.out.println(a[i]);
	}
}
}
