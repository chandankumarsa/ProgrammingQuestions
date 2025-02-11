class Employee {
    String name;
    int age;
    int id;
    long mobile;

    public Employee() {
    }

    public Employee(String name, int age, int id, long mobile) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.mobile = mobile;
    }

    // toString method implementation
    @Override
    public String toString() {
        return name + " ," + age + "," + id + "," + mobile; // "," is for better readability
    }

    // equals Implementation
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // If both references are the same, return true
        if (o == null || getClass() != o.getClass()) return false; // Check for null and class type
        Employee c = (Employee) o;
        return this.age == c.age && this.id == c.id && this.mobile == c.mobile && this.name.equals(c.name);
    }
}

public class Demo {
    public static void main(String[] args) {
        Employee e = new Employee("chandan", 20, 1, 784);
        System.out.println(e);
        Employee e1 = new Employee("Animesh", 21, 2, 7846664);
        System.out.println(e1);
        System.out.println("===========");
        Employee c = new Employee("chiku", 20, 1, 784);
        Employee c1 = new Employee("chiku", 20, 1, 784);
        System.out.println(c == c1); // false (different objects)
        System.out.println(c.equals(c1)); // true (same content)
    }
}
