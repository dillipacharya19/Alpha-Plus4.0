public class OOPS {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();          // inherited from Animal
        dobby.walk();         // inherited from Mammel
        dobby.legs = 4;       // specific to Dog
        System.out.println(dobby.legs);
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eating...");
    }
    void breathe() {
        System.out.println("breathing...");
    }
}

class Mammel extends Animal {
    void walk() {
        System.out.println("walking...");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swimming...");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flying...");
    }
}

// Dog class extending Mammel
class Dog extends Mammel {
    int legs;   // property specific to Dog
}