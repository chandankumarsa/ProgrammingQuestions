package J_FactoryMethod;
import java.util.Scanner;

class Book {
    String Title;
    String Author;
    double Price;

    public Book(String t, String a, double p) {
        Title = t;
        Author = a;
        Price = p;
    }

    void display() {
        System.out.println("Title  = " + Title);
        System.out.println("Author = " + Author);
        System.out.println("Price  = " + Price);
        System.out.println("_____________________");
    }
}

class BookCreator { // Factory class
    static Book getObject() { // Factory Method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Title: ");
        String t = sc.nextLine(); // Changed to nextLine()

        System.out.println("Enter Author: ");
        String a = sc.nextLine(); // Changed to nextLine()

        System.out.println("Enter Price: ");
        double d = sc.nextDouble();

        return new Book(t, a, d);
    }
}

public class Example2 {
    public static void main(String[] args) {
        Book b1 = BookCreator.getObject();
        b1.display();
    }
}
