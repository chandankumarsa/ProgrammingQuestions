package NumberProgramUsingRecursion;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter a number to convert decimal to binary");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Binary value: ");
        decimalToBinary(n);
        sc.close();
    }

    public static void decimalToBinary(int n) {
        // Base case: when n becomes 0, stop the recursion
        if (n == 0) {
            return;
        }
        // Recursive case: first divide n by 2 and print the binary digits
        decimalToBinary(n / 2);
        System.out.print(n % 2); // Print the remainder (binary digit)
    }
}
