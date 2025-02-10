package Feb6;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number to reverse");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {  
            int rem = n % 10;
            rev = rev * 10 + rem; 
            n /= 10;
        }
        System.out.println("Reverse of the Number is: " + rev);
    }
}
