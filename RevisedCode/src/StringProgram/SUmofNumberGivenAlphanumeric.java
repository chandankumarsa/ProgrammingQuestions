package StringProgram;

public class SUmofNumberGivenAlphanumeric {
public static void main(String[] args) {
	
	int a[][]= {{1,2,3},{5,7,0},{4,6,9}};
	int max =0;	
	int sec_max=0;
	for(int i =0;i<a.length;i++) {
		for(int j =0;j<a.length;j++) {
			if(a[i][j]>max)
			{
				sec_max=max;
				max=a[i][j];
			}
			else if(a[i][j]>sec_max && a[i][j]!=max)
			{
				sec_max=a[i][j];
			}
			
		}
	}
	System.out.println(sec_max);
  }
}
