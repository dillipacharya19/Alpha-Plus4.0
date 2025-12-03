public class OOPS {
    public static void main(String args[]) {
        Mustang myHorse = new Mustang();
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walks();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Constructor of Horse called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walks() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Constructor of Mustang called");
    }
}