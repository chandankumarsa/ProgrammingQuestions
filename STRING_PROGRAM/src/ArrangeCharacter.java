import java.util.Scanner;

public class ArrangeCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        String uc = "", lc = "", sp = "", nc = "";
        for (int i = 0; i < s.length(); i++) {  // Fixed loop condition
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') uc += ch;
            else if (ch >= 'a' && ch <= 'z') lc += ch;
            else if (ch >= '0' && ch <= '9') nc += ch;
            else sp += ch;
        }
        
        res = lc + uc + nc + sp;
        System.out.println("Rearranged string: " + res);
    }
}

// Question:
// Write a Java program to rearrange characters in a given string 
// such that all lowercase letters appear first, followed by uppercase letters, 
// then numbers, and finally special characters.
