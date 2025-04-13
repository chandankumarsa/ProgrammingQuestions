import java.util.function.Function;

public class Palindrome {
    public static void main(String[] args) {
        int n = 121; // Change this number to test other values

        Function<Integer, Boolean> f = x -> {
            int t = x, r = 0;
            while (t > 0) {
                int d = t % 10;
                r = r * 10 + d;
                t = t / 10;
            }
            return r == x;
        };

        if (f.apply(n)) {
            System.out.println(n + " is a Palindrome Number");
        } else {
            System.out.println(n + " is Not a Palindrome Number");
        }
    }
}
