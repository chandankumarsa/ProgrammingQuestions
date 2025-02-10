package NumberProgram;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n; // Store the original number
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if (rev == temp) {
            System.out.println(temp + " is a Palindrome Number");
        } else {
            System.out.println(temp + " is not a Palindrome Number");
        }
    }
}
