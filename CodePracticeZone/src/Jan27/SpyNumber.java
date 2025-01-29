package Jan27;

public class SpyNumber {
public static void main(String[] args) {
	int n = 321;
	System.out.println(isSpy(n, n, 1));
}
public static boolean isSpy(int n,int sum,int prod) {
	if(n==0)return sum== prod;
	int r = n%10;
	sum+=r;
	prod*=r;
	return isSpy(n/10, sum, prod);
}
}
