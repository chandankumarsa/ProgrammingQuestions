package NumberProgramUsingMethod;
import java.util.Scanner;
public class AutomorphicNumberOrNot {
	public static void main(String[] args) {
		 System.out.println("Enter a Number To Check If It Is an Automorphic Number Or Not");
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        isAutomorphic(n);
	}
	static void isAutomorphic(int n) {
		int sq = n * n;
        boolean flag = true;
        int temp = n; // Save the original number for the result message
        while (n > 0) {
            if (n % 10 != sq % 10) {
                flag = false;
                break;
            }
            n = n / 10;
            sq = sq / 10;
        }
        
        if (flag) {
            System.out.println(temp + " is an Automorphic Number.");
        } else {
            System.out.println(temp + " is Not an Automorphic Number.");
        }
	}

}
