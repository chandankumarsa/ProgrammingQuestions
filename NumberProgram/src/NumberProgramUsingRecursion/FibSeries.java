package NumberProgramUsingRecursion;
import java.util.Scanner;
public class FibSeries {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        int n = new Scanner(System.in).nextInt();
        display(0, 1, 1, n); 
    }
    static void display(int a, int b, int count, int n) {
       
        if (count > n) return;
        
        System.out.print(a + " ");
        display(b, a + b, count + 1, n); 
    }
}
