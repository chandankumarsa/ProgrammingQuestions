package L_ConstructorChainning;

class AA {
    AA() {
        this(60);
        System.out.println("AA () cons");
    }

    AA(int i) {
        System.out.println("AA (int i) cons " + i);
    }
}

class BB extends AA {
    BB() {
        super(50);
        System.out.println("BB () cons ");
    }

    BB(int i) {
        this();
        System.out.println("BB (int i) cons : " + i);
    }
}

class CC extends BB {
    CC() {
        this(10);
        System.out.println("CC cons");
    }

    CC(int i) {
        System.out.println("CC (int i) cons : " + i);
    }
}

public class Example2 {
    public static void main(String[] args) {
        new CC(); 
    }
}
