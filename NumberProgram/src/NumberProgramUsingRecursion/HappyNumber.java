package NumberProgramUsingRecursion;
import java.util.Scanner;
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number To check Happy Number or Not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isHappy(n)) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }
    static boolean isHappy(int n) {
        if (n == 1) return true; 
        if (n == 4) return false; 
        return isHappy(sumOfSquares(n));
    }
    static int sumOfSquares(int n) {
        if (n == 0) return 0;
        int rem = n % 10;
        return (rem * rem) + sumOfSquares(n / 10);
    }
}
