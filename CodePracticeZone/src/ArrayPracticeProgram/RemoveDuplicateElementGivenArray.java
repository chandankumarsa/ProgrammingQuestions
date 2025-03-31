package ArrayPracticeProgram;

public class RemoveDuplicateElementGivenArray {
public static void main(String[] args) {
	int a[]= {1,2,0,0,1,2,3,4,5};
	int max =Integer.MAX_VALUE;
	for(int i =0;i<a.length;i++) {
		if(a[i]==max)continue;
		int count =0;
		for(int j =i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				a[j]=max;
			}
		}
		System.out.print(a[i] +" ");
	}
}
}
