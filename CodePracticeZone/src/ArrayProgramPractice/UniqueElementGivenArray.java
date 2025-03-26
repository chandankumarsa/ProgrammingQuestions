package ArrayProgramPractice;

public class UniqueElementGivenArray {
public static void main(String[] args) {
	int a[] = { 10, 30, 20, 30, 40, 50, 60, 20, 10 };
	for(int i =0;i<a.length;i++) {
		int count =0;
		for(int j =0;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
			}
		}
		if(count ==1)System.out.println(a[i]);
	}
}
}
