public class PrintOddIndexElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        
        for (int i = 1; i < arr.length; i += 2) { // Start from index 1 and increment by 2
            System.out.println(arr[i]);
        }
    }
}
