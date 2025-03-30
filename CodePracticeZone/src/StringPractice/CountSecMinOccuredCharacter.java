package StringPractice;

import java.util.Scanner;

public class CountSecMinOccuredCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int mincount = s.length(), secmincount = s.length();
        char minchar = s.charAt(0), secminchar = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) count++;
            }

            if (count < mincount) {
                secmincount = mincount;
                secminchar = minchar;
                mincount = count;
                minchar = ch;
            } else if (count < secmincount && count != mincount) {
                secmincount = count;
                secminchar = ch;
            }
        }

        System.out.println(secminchar + " : " + secmincount);
    }
}
