public class OOPS {
    // Method over loading in Java

    public static void main(String[] args) {
        Dear d = new Dear();
        d.eat();

    }
}

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dear extends Animal {
    void eat() {
        System.out.println("eating grass...");
    }
}
