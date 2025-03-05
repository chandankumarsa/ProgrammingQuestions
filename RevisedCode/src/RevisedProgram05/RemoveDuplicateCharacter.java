package RevisedProgram05;

public class RemoveDuplicateCharacter {
public static void main(String[] args) {
	int a[] = { 1, 2, 2, 3, 4, 5, 5 };
	int max=Integer.MAX_VALUE;
	for(int i =0;i<a.length;i++) {
		if(a[i]==max)continue;
		for(int j =i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				a[j]=max;
			}
		}
		System.out.print(a[i] +" ");
	}
}
}
