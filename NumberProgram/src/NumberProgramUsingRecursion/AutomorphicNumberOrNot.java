package NumberProgramUsingRecursion;
import java.util.Scanner;

public class AutomorphicNumberOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a Number To Check If It Is an Automorphic Number Or Not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isAutomorphic(n, n * n)) {
            System.out.println(n + " is an Automorphic Number.");
        } else {
            System.out.println(n + " is Not an Automorphic Number.");
        }
    }

    static boolean isAutomorphic(int n, int sq) {
        // Base case: If n becomes 0, it means all digits matched
        if (n == 0) {
            return true;
        }
        // Check if last digits of n and sq are equal
        if (n % 10 != sq % 10) {
            return false;
        }
        // Recursive call with remaining digits
        return isAutomorphic(n / 10, sq / 10);
    }
}

