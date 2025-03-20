package Practice20;
public class PrintAllPossibleSubstrings {
    public static void main(String[] args) {
        String str = "abc";
        
        // Outer loop for the starting point of the substring
        for (int i = 0; i < str.length(); i++) {
            // Inner loop for the ending point of the substring
            for (int j = i + 1; j <= str.length(); j++) {
                // Print each substring from index i to j-1
                System.out.println(str.substring(i, j));
            }
        }
    }
}

