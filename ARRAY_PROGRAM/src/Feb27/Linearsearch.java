package Feb27;
// Write a Java program to search an Array Element using Linear search
public class Linearsearch {
    public static void main(String[] args) {
        int a[] = {5, 3, 7, 8, 9, 1};
        System.out.println(find(a, 8));
    }

    static int find(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) return i;
        }
        return -1;
    }
}
