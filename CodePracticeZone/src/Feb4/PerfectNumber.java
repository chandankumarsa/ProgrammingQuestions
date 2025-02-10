package Feb4;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number to check Perfect Number or Not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;  

        for (int i = 1; i < n; i++) { // Exclude 'n' itself
            if (n % i == 0) {
                sum += i;  
            }
        }

        if (sum == n) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is not a Perfect Number");
        }
    }
}
