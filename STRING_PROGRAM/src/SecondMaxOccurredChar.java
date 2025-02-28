// Q: Write a Java program to print the second most occurred character count in a given string.
// Input: jaaavvvaa
// Output: v=3

import java.util.Scanner;

public class SecondMaxOccurredChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        char maxChar = '\0', secondMaxChar = '\0';
        int maxCount = 0, secondMaxCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            
            if (count > maxCount) {
                secondMaxCount = maxCount;
                secondMaxChar = maxChar;
                maxCount = count;
                maxChar = ch;
            } else if (count > secondMaxCount && ch != maxChar) {
                secondMaxCount = count;
                secondMaxChar = ch;
            }
        }
        
        System.out.println(secondMaxChar + "=" + secondMaxCount);
    }
}