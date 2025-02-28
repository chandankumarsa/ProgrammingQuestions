public class SumEvenOdd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 67, 8, 9};
        int evenSum = 0, oddSum = 0;
        
        for (int n : arr) {
            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
        }
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
