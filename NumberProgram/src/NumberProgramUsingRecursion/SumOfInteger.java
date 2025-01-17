package NumberProgramUsingRecursion;
import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        System.out.println("Enter a Number to CALCULATE THE SUM OF INTEGER ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sumOfInteger(n);
        System.out.println(ans);
    }

    static int sumOfInteger(int n) {
        if (n == 0) {  // base case: if n is 0, return 0
            return 0;
        } else {
            return n + sumOfInteger(n - 1);  // recursive step
        }
    }
}
