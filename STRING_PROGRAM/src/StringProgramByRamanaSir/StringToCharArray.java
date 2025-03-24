package StringProgramByRamanaSir;

import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // Convert string to char array manually
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);  // Copy each character to the array
        }
        
        // Display the char array
        System.out.print("Character Array: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}
