package D_AbandonObject;
class Car {
    String model;
}

public class Example {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Toyota";

        Car c2 = new Car();
        c2.model = "Honda";

        c1 = c2; // The first "Toyota" object is abandoned
        System.out.println("c1.model = " + c1.model); // Prints "Honda"
    }
}
