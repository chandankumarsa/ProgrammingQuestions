import java.util.Scanner;

public class MaxOccurredChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();     
        char maxChar = s.charAt(0);
        int maxCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            
            if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
        }
        
        System.out.println(maxChar + "=" + maxCount);
    }
}
