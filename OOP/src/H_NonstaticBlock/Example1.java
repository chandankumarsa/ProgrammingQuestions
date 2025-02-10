package H_NonstaticBlock;

class E {
    {  // ✅ Non-static block (Instance Block)
        System.out.println("Nonstatic block in E");
    }

    E() {
        System.out.println("0 arg Constructor");
    }

    E(int i) {
        System.out.println("1 arg Constructor");
    }
}

public class Example1 {
    public static void main(String[] args) {
        new E();  // Creates an object of E
        System.out.println("---------------");
        new E(10);  // Creates another object of E
    }
}
