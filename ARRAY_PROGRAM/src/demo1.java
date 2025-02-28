import java.util.Arrays;

public class demo1 {
public static void main(String[] args) {
	int [] a= {1,2,3,4,5,6};
	m1(a);
	System.out.println(Arrays.toString(a));
}
static void m1(int []a) {
	a[1]++;
}
}
