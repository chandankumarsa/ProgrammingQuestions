package Feb_11;

import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        System.out.println("Enter a number to print the first N Fibonacci numbers:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); // Close scanner to prevent leaks

        fib(0, 1, 1, n);
    }

    static void fib(int a, int b, int count, int n) {
        if (count > n) return;
        System.out.print(a + " ");
        fib(b, a + b, count + 1, n);
    }
}
