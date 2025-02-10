//Prefer
package I_CopyConstructor;

class E {
    int data;

    // Normal Constructor
    E(int data) {
        this.data = data;
        System.out.println("Constructor with 1 argument");
    }

    // Copy Constructor (Takes an object of the same class)
    E(E obj) {
        this.data = obj.data;
        System.out.println("Copy Constructor");
    }

    void display() {
        System.out.println("Data: " + data);
    }
}

public class Example {
    public static void main(String[] args) {
        E obj1 = new E(10);  // Calls normal constructor
        obj1.display();

        E obj2 = new E(obj1);  // Calls copy constructor
        obj2.display();
    }
}

