package Recurssion10;

import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        System.out.println("Enter a Number to find the Fibonacci series:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); 
        fib(0, 1, n);
    }

    static void fib(int a, int b, int n) {
        if (n == 0) return;
        System.out.print(a + " ");
        fib(b, a + b, n - 1);
    }
}
