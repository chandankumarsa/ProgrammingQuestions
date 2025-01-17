package NumberProgramUsingRecursion;
import java.util.Scanner;
public class SumOfDigitShouldSingleDigit {
    static int sum(int n) {
        // Base case: If the number is a single digit, return it
        if (n >= 0 && n <= 9) {
            return n;
        }        
        // Recursive step: Calculate sum of digits and call sum again
        return sum(sumOfDigits(n));
    } 
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        System.out.println("Enter a Number To Find The Sum Of Digit Should Be Single Digit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum Of Digit Should Be Single Digit of a Given Number is: " + sum(n));
    }
}
