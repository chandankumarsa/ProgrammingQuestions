import java.util.Scanner;

public class MinOccurredChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char minChar = s.charAt(0);
        int minCount = s.length();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            if (count < minCount) {
                minCount = count;
                minChar = ch;
            }
        }
        
        System.out.println(minChar + "=" + minCount);
    }
}
