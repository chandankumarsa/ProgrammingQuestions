import java.util.Scanner;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        String result = "";
        boolean spaceFound = false;
        int start = 0, end = s.length() - 1;
        
        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }
        
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) == ' ') {
                if (!spaceFound) {
                    result += " ";
                }
                spaceFound = true;
            } else {
                result += s.charAt(i);
                spaceFound = false;
            }
        }
        
        System.out.println(result);
    }
}
