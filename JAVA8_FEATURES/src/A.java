import java.util.function.Function;

public class A {
    public static void main(String[] args) {
        int[] a = {12, 305, 89}; // Sample input array

        Function<Integer, String> f = n -> {
            int t = n;
            String r = "";
            while (t > 0) {
                int d = t % 10;
                int s = d * d;
                r = s + " " + r;
                t = t / 10;
            }
            return r.trim();
        };

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digit squares in " + a[i] + ": " + f.apply(a[i]));
        }
    }
}
