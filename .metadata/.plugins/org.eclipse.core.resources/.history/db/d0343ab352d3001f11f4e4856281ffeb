package NumberProgramUsingRecursion;
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Enter A Number To Find The Sum Of Its Digits");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("Sum Of The Digits Of The Given Number is: " + result);
    }

    static int sum(int n) {
        // Base case: when n becomes 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: extract the last digit and call sum with the remaining digits
        return n % 10 + sum(n / 10);
    }
}

