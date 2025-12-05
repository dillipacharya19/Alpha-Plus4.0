public class index {
    public static void main(String[] args) {
        vehical obj1 = new car();
        obj1.print();
    }

}

class vehical {
    void print() {
        System.out.println("Base class (vehical)");
    }
}

class car extends vehical {
    void print() {
        System.out.println("Derived class (car)");
    }
}