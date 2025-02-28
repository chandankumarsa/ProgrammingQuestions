//Wrong
import java.util.Scanner;
public class ReplaceConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        String result = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                    result += "$";
                }
            } else {
                result += s.charAt(i);
            }
        }
        
        System.out.println(result);
    }
}