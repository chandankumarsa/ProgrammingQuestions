import java.util.function.Predicate;

public class EvenNumberPredicate {
    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 8, 15, 22, 7}; // Sample array

        Predicate<Integer> isEven = n -> n % 2 == 0;

        for (int i = 0; i < arr.length; i++) {
            if (isEven.test(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
}
