package NumberProgramUsingRecursion;
import java.util.Scanner;

public class HCFOfTwoNumber {
    public static void main(String[] args) {
        System.out.println("Enter Two Numbers To Perform HCF Operation:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = findHcf(a, b);
        System.out.println("HCF of Two Numbers is: " + hcf);
    }

    static int findHcf(int a, int b) {
        if (b == 0) {
            return a; // Base case: when the second number becomes 0
        }
        return findHcf(b, a % b); // Recursive call with (b, a % b)
    }
}
