class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }
    
    // Copy Constructor
    public Shape(Shape s) {
        this.color = s.color;
    }

    public void display() {
        System.out.println("Color: " + color);
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(String color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }
    
    // Copy Constructor
    Rectangle(Rectangle r) {
        super(r); // Calls the copy constructor of Shape
        this.length = r.length;
        this.breadth = r.breadth;
    }

    public void display() {
        super.display();
        System.out.println("Length: " + length + ", Breadth: " + breadth);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("Red", 10, 20);
        r1.display();
        
        System.out.println("\nCopying r1 to r2");
        Rectangle r2 = new Rectangle(r1); // Using copy constructor
        r2.display();
    }
}