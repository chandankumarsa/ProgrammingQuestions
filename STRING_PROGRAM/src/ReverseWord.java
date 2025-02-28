public class ReverseWord {
    public static void main(String[] args) {
        String s = "java is easy";
        System.out.println(rev(s));	
    }
    static String rev(String s) {
        int i = 0;
        int j = 0;
        String res = "";
        while (j < s.length()) {
            while (j < s.length() && s.charAt(j) != ' ')
                j++;  // Move j to the end of the word
            
            int k = j - 1; // Start from last letter of the word
            
            while (k >= i) {  // Reverse the word
                res += s.charAt(k);
                k--;
            }

            if (j < s.length()) { // Add space after the word
                res += " ";
            }
            
            j++; // Move to the next word
            i = j; // Set i to the start of the next word
        }
        return res;
    }
}
