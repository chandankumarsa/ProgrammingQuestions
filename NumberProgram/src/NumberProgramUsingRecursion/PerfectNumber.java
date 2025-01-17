package NumberProgramUsingRecursion;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number To Check Perfect Number OR not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfDivisors(n, 1, 0); // Start the recursion with divisor 1 and initial sum 0
        if (sum == n) {
            System.out.println(n + " is a Perfect number");
        } else {
            System.out.println(n + " is Not a Perfect Number");
        }
        sc.close();
    }

    // Recursive method to calculate the sum of divisors
    static int sumOfDivisors(int n, int i, int sum) {
        // Base case: when i is greater than n/2, stop recursion
        if (i > n / 2) {
            return sum;
        }
        // If i is a divisor of n, add it to the sum
        if (n % i == 0) {
            sum += i;
        }
        // Recursive call with next divisor i+1
        return sumOfDivisors(n, i + 1, sum);
    }
}

