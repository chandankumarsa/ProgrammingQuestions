package NumberProgramUsingRecursion;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number To check Prime Number or Not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n, 2)) {  // Start recursion with i = 2
            System.out.println("is a prime Number");
        } else {
            System.out.println("is Not a prime Number");
        }
    }

    static boolean isPrime(int n, int i) {
        if (n <= 1) {
            return false;  // Base case for numbers <= 1
        }
        if (i > n / 2) {
            return true;  // Base case: If no divisors found, n is prime
        }
        if (n % i == 0) {
            return false;  // If divisible, n is not prime
        }
        return isPrime(n, i + 1);  // Recursive call with i + 1
    }
}

