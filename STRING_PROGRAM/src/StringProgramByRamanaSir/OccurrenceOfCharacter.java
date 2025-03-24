package StringProgramByRamanaSir;

import java.util.Scanner;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '\u0000') continue;  // Skip already counted characters
            int count = 1;
            // Check for occurrences of the character
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\u0000';  // Mark the character as counted
                }
            }

            System.out.println(ch[i] + " : " + count);  // Print the count
        }
    }
}
