package Feb4;
import java.util.Scanner;
public class AutomorphicNUmber {
public static void main(String[] args) {
	System.out.println("Enter a Number");
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int sq= n*n;
	boolean flag = true;
	
	while(n>0) {
		if(n%10!= sq%10) {
			flag = false;
			break;
		}
		n = n/10;
		sq = sq/10;
	}
	if(flag) {
		System.out.println(" is an Automorphic Number ");
	}else {
		System.out.println(" is Not a Automorphic Number ");
	}
}

}
