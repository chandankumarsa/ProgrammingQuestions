package TwoD_Array05;

public class FIND_PRIMEnUMBER {
    public static void main(String[] args) {
        int[][] a = {
            {7, 10, 20},
            {5, 6, 8},
            {2, 4, 7}
        };

        System.out.println("Prime numbers in the given 2D array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (isPrime(a[i][j])) {
                    System.out.println(a[i][j] );
                }
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
