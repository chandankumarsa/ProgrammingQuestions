package Jan23;

import java.util.Scanner;

public class Print1ton {
    public static void main(String[] args) {
        System.out.println("Enter a Number to Print 1 to n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Print 1 to n numbers are: ");
        print(n);  // Call the print method to print numbers
    }

    static void print(int n) {
        if (n == 0) {
            return;  // Base case, stop recursion when n reaches 0
        }
        print(n - 1);  // Recursive call to print previous numbers first
        System.out.print(n + " ");  // Print the current number after the recursive call
    }
}
