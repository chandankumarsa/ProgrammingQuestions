public class Main {
    public static void main(String[] args) {
        String str = "malayalam";
        String smallestPalindrome = str;

        // Loop through the string
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring) && substring.length() < smallestPalindrome.length() && substring.length() > 1) {
                    smallestPalindrome = substring;
                }
            }
        }

        System.out.println(smallestPalindrome);
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}