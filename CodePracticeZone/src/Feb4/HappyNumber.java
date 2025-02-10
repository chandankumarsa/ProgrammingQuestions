package Feb4;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number to check if it is a Happy Number or not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = n;
        
        while (res != 1 && res != 4) {
            int sum = 0;
            while (res > 0) {
                int rem = res % 10;
                sum = sum + rem * rem;
                res /= 10;
            }
            res = sum;
        }
        
        if (res == 1) {
            System.out.println(n + " is a Happy Number");
        } else {
            System.out.println(n + " is not a Happy Number");
        }
    }
}
