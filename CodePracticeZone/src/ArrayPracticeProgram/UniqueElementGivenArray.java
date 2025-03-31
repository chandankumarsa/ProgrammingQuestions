package ArrayPracticeProgram;

public class UniqueElementGivenArray {
public static void main(String[] args) {
	int a[]= {1,2,0,0,1,2,3,4,5};
	for(int i =0;i<a.length;i++) {
		int count =0;
		for(int j =0;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
			}
		}
		if(count==1)System.out.println(a[i]);
	}
}
}
