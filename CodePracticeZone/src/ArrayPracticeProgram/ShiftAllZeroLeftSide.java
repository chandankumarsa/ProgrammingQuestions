package ArrayPracticeProgram;

import java.util.Arrays;

public class ShiftAllZeroLeftSide {
    public static void main(String[] args) {
        int a[] = {5, 6, 0, 0, 0, 9, 0, 4};
        int j = a.length - 1; // Pointer for placing non-zero elements

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                a[j--] = a[i];
                if (i != j) a[i] = 0;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
