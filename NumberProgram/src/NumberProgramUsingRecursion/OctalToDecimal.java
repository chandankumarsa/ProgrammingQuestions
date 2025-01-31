package NumberProgramUsingRecursion;
import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter a number To Convert Octal To Decimal");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Decimal Equivalent: " + octalToDecimal(n, 1));
    }

    public static int octalToDecimal(int n, int place) {
        if (n == 0) {
            return 0;
        } else {
            int rem = n % 10;
            return rem * place + octalToDecimal(n / 10, place * 8);
        }
    }
}
