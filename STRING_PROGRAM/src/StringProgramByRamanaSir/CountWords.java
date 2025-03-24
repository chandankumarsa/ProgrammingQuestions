package StringProgramByRamanaSir;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim(); // Remove leading and trailing spaces
        if (s.isEmpty()) { // Handle empty input case
            System.out.println("Word count: 0");
            return;
        }
        String[] words = s.split("\\s+"); // Split by one or more spaces
        System.out.println("Word count: " + words.length);
    }
}

