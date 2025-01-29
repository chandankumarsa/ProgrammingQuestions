package NumberProgramUsingRecursion;

import java.util.Scanner;

public class PrintNumber1to5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n, 1);
    }

    static void print(int n, int c) {
        if (c > n) return; // Stop when current exceeds n
        System.out.print(c + " "); // Print the current number
        print(n, c + 1); // Recursively call with the next number
    }
}
