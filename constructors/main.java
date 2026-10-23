public class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        this(10);
        System.out.println("B default");
    }

    B(int x) {
        super();
        System.out.println("B parameterized");
    }
}

public class Main {
    public static void main(String[] args) {
        new B();
    }
} 
