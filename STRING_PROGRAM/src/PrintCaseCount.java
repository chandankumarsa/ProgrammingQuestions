import java.util.Scanner;

public class PrintCaseCount {
    public static void main(String[] args) {
        System.out.println("Enter a String to case count");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int uc = 0, lc = 0, nc = 0, sp = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') uc++;
            else if (ch >= 'a' && ch <= 'z') lc++;
            else if (ch >= '0' && ch <= '9') nc++;
            else sp++;  // Now only special characters and spaces are counted
        }
        
        System.out.println("Upper case :" + uc);
        System.out.println("Lower Case :" + lc);
        System.out.println("Number Case :" + nc);
        System.out.println("Special Case :" + sp);
    }
}
