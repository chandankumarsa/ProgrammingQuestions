package NumberProgramUsingRecursion;
import java.util.Scanner;

public class LCM_NUMBER {
public static void main(String[] args) {
	System.out.println("Enter Two Number To Find Lcm");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int lcm =findLcm(a, b, (a>b?a:b));
	System.out.println("Lcm Of Two Number Is : "+lcm);
}
static int findLcm(int a,int b,int curr) {
	if(curr%a==0 && curr%b==0) {
		return curr;
	}
	return findLcm(a,b,curr+1);
	
}
}
