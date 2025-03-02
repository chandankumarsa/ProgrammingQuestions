package Array02;

public class UniqueElementGivenArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 4, 4, 4 };
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            if(a[i] == max) continue; // Skip already marked elements
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = max; // Mark as visited
                }
            }
            if (count == 0) System.out.println(a[i] + " ");
        }
    }
}
