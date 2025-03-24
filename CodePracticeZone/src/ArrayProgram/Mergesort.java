package ArrayProgram;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int a[] = {6, 9, 5, 2, 3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int a[]) {
        if (a.length <= 1) return;  // Base condition to stop recursion
        int mid = a.length / 2;
        int left[] = new int[mid];
        int right[] = new int[a.length - mid];
        // Copying elements into left and right arrays
        for (int i = 0; i < left.length; i++) {
            left[i] = a[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = a[mid + i];
        }
        // Recursive sorting
        sort(left);
        sort(right);
        // Merge back into `a`
        merge(left, right, a);
    }
    static void merge(int left[], int right[], int a[]) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length) a[k++] = left[i++];
        while (j < right.length) a[k++] = right[j++];
    }
}