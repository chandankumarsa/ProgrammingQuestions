package Jan27;
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 0;
        int rev = reverseNumber(n, 0);
        System.out.println("Reversed number: " + rev);
    }

    public static int reverseNumber(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + (n % 10);
        return reverseNumber(n / 10, rev);
    }
}
