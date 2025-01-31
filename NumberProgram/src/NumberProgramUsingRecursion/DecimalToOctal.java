package NumberProgramUsingRecursion;
import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number To Convert Decimal to Octal");
        int n = sc.nextInt();
        System.out.println("Octal Equivalent: " + decimalToOctal(n));
    }

    public static int decimalToOctal(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 8) + decimalToOctal(n / 8) * 10;
        }
    }
}
