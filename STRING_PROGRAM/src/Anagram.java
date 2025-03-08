import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }    
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        // Convert strings to character arrays and sort them
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
