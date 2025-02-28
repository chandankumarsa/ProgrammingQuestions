import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                System.out.print(ch);
            }
        }
    }
}
