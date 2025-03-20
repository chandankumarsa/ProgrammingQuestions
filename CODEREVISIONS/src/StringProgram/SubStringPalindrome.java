package StringProgram;

public class SubStringPalindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        String palindrome = s; // This should start with a large string to find the smallest palindrome substring

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) { // j should go up to s.length()
                String substring = s.substring(i, j + 1); // Fix the range issue
                if (isPalindrome(substring) && substring.length() < palindrome.length()) {
                    palindrome = substring;
                }
            }
        }
        System.out.println(palindrome);
    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
