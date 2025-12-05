public class index {
    public static void main(String[] args) {
        obj1.print();
        vehicle obj2 = new vehicle();
        obj2.print();
    }
}

class vehicle {
    void print() {
        System.out.println("Base Class: Vehicle");
    }
}

class car extends vehicle {
    void print() {
        System.out.println("Derived Class: Car");
    }
}