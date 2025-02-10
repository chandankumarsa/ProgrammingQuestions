package Feb_8Rec;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfect(n, n / 2, 0));
    }

    static boolean isPerfect(int n, int i, int sum) {
        if (i == 0) return sum == n; // Base condition (stops at 0)
        
        if (n % i == 0) {
            sum += i; // Add divisor to sum
        }
        
        return isPerfect(n, i - 1, sum); // Recursive call
    }
}
