package NumberProgramUsingRecursion;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter a number to convert binary to decimal");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = binaryToDecimal(n, 0);
        System.out.println("Decimal value: " + result);
    }
    public static int binaryToDecimal(int n, int place) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(2, place) + binaryToDecimal(n / 10, place + 1);
    }
}
