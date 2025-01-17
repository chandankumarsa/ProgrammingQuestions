package NumberProgramUsingRecursion;
import java.util.Scanner;
public class SumOfEvenOddPrintSeparately {
    public static void main(String[] args) {
        System.out.println("Enter a Number To Print Sum Of Even And Odd Digits Separately");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenSum = sumEvenDigits(n);
        int oddSum = sumOddDigits(n);
        System.out.println("Sum Of The EVEN Digits is: " + evenSum);
        System.out.println("Sum Of The ODD Digits is: " + oddSum);
    }

    static int sumEvenDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        if (rem % 2 == 0) {
            return rem + sumEvenDigits(n / 10);
        } else {
            return sumEvenDigits(n / 10);
        }
    }

    static int sumOddDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        if (rem % 2 != 0) {
            return rem + sumOddDigits(n / 10);
        } else {
            return sumOddDigits(n / 10);
        }
    }
}
