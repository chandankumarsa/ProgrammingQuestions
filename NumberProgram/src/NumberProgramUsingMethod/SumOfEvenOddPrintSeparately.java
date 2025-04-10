package NumberProgramUsingMethod;

import java.util.Scanner;

public class SumOfEvenOddPrintSeparately {
public static void main(String[] args) {
	 System.out.println("Enter a Number To Print Sum Of Even And Odd Digits Separately");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     sum(n) ;
}

static void sum(int n) {
	int esum = 0;
    int osum = 0;

    while (n > 0) {
        int rem = n % 10;
        if (rem % 2 == 0) { // Check parity of the digit
            esum += rem;
        } else {
            osum += rem;
        }
        n = n / 10;
    }

    System.out.println("Sum Of The EVEN Digits is: " + esum);
    System.out.println("Sum Of The ODD Digits is: " + osum);
}


}
