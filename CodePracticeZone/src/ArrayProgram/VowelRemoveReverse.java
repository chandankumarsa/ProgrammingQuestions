package ArrayProgram;
import java.util.Scanner;

public class VowelRemoveReverse {
    
    static boolean hasVowel(String w) {
        String v = "aeiouAEIOU";
        for (int i = 0; i < w.length(); i++) {
            for (int j = 0; j < v.length(); j++) {
                if (w.charAt(i) == v.charAt(j)) return true;
            }
        }
        return false;
    }
    
    static String removeVowels(String w) {
        String v = "aeiouAEIOU", res = "";
        for (int i = 0; i < w.length(); i++) {
            boolean isVowel = false;
            for (int j = 0; j < v.length(); j++) {
                if (w.charAt(i) == v.charAt(j)) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel) res += w.charAt(i);
        }
        return res;
    }
    
    static String reverseWord(String w) {
        String res = "";
        for (int i = w.length() - 1; i >= 0; i--) res += w.charAt(i);
        return res;
    }
    
    static String processString(String s) {
        String res = "", w = "";
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                if (hasVowel(w)) res += removeVowels(w);
                else res += reverseWord(w);
                if (i < s.length()) res += " ";
                w = "";
            } else {
                w += s.charAt(i);
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(processString(s));
    }
}
