package NumberProgramUsingRecursion;
import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number To Find The Factorial");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial Of a Given Number is : " + fact(n));
        sc.close();
    }

    static int fact(int n) {
        // Base case: If n is 0, return 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * fact(n - 1);
    }
}

