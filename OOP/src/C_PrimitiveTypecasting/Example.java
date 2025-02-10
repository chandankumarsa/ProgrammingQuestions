package C_PrimitiveTypecasting;

public class Example {
    public static void main(String[] args) {
        // Widening (Implicit)
        int a = 20;
        double d = a;  // int to double (automatic conversion)
        System.out.println("Widening: int to double, d = " + d);

        char ch = 'A';
        int ascii = ch; // char to int (automatic widening)
        System.out.println("Widening: char to int, ASCII = " + ascii);

        // Narrowing (Explicit)
        double x = 12.6;
        int n = (int) x;  // double to int (truncation occurs)
        System.out.println("Narrowing: double to int, n = " + n);

        int largeNumber = 150;
        byte smallNumber = (byte) largeNumber;  // int to byte (possible data loss)
        System.out.println("Narrowing: int to byte, smallNumber = " + smallNumber);
    }
}
