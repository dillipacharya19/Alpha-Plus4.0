class Student {
    String name;
    int age;

    // Normal constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create first object
        Student s1 = new Student("Dillip", 21);

        // Create second object using copy constructor
        Student s2 = new Student(s1);

        // Display both
        s1.display();
        s2.display();
    }
}